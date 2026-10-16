import * as THREE from 'three';
import { OrbitControls } from 'three/addons/controls/OrbitControls.js';
import { GLTFLoader } from 'three/addons/loaders/GLTFLoader.js';
import { DRACOLoader } from 'three/addons/loaders/DRACOLoader.js';
import { SkeletonHelper } from 'three';
import { createHumanoidRig, skinMeshToSkeleton } from './skeleton-rig.js';
import { PRESETS, DEFAULT_CODE } from './presets.js';

// ── Globals ─────────────────────────────────────
let scene, camera, renderer, controls;
let model = null;
let skinnedMesh = null;
let rig = null;
let skeletonHelper = null;
let gridHelper = null;
let animationFn = null;
let animTime = 0;
let animSpeed = 1;
let isPlaying = false;
let clock = new THREE.Clock();

// ── DOM ─────────────────────────────────────────
const canvas = document.getElementById('three-canvas');
const loadingEl = document.getElementById('loading');
const loadingText = document.getElementById('loading-text');
const codeEditor = document.getElementById('code-editor');
const presetSelect = document.getElementById('preset-select');
const btnRun = document.getElementById('btn-run');
const btnStop = document.getElementById('btn-stop');
const btnSkeleton = document.getElementById('btn-skeleton');
const btnGrid = document.getElementById('btn-grid');
const btnWireframe = document.getElementById('btn-wireframe');
const btnRef = document.getElementById('btn-ref');
const btnResetPose = document.getElementById('btn-reset-pose');
const btnExport = document.getElementById('btn-export');
const speedSlider = document.getElementById('speed-slider');
const speedValue = document.getElementById('speed-value');
const refOverlay = document.getElementById('ref-overlay');
const structureTree = document.getElementById('structure-tree');
const boneTree = document.getElementById('bone-tree');
const modelInfo = document.getElementById('model-info');

// ── Scene setup ─────────────────────────────────
function initScene() {
  scene = new THREE.Scene();
  scene.background = new THREE.Color(0x0d0d1a);

  camera = new THREE.PerspectiveCamera(45, canvas.clientWidth / canvas.clientHeight, 0.01, 100);
  camera.position.set(0, 0.3, 3.2);

  renderer = new THREE.WebGLRenderer({ canvas, antialias: true });
  renderer.setSize(canvas.clientWidth, canvas.clientHeight);
  renderer.setPixelRatio(Math.min(window.devicePixelRatio, 2));
  renderer.outputColorSpace = THREE.SRGBColorSpace;
  renderer.toneMapping = THREE.ACESFilmicToneMapping;
  renderer.toneMappingExposure = 1.0;

  // Lights
  scene.add(new THREE.HemisphereLight(0xffffff, 0x444466, 1.0));
  const key = new THREE.DirectionalLight(0xffffff, 1.5);
  key.position.set(2, 3, 4);
  scene.add(key);
  const fill = new THREE.DirectionalLight(0x8899ff, 0.5);
  fill.position.set(-3, 1, 2);
  scene.add(fill);
  const rim = new THREE.DirectionalLight(0xffddaa, 0.8);
  rim.position.set(0, 2, -4);
  scene.add(rim);

  // Grid
  gridHelper = new THREE.GridHelper(4, 20, 0x444466, 0x222244);
  gridHelper.position.y = -1;
  scene.add(gridHelper);

  // Controls
  controls = new OrbitControls(camera, canvas);
  controls.enableDamping = true;
  controls.dampingFactor = 0.08;
  controls.minDistance = 0.5;
  controls.maxDistance = 10;
  controls.target.set(0, 0.3, 0);

  // Resize
  window.addEventListener('resize', onResize);
  onResize();
}

function onResize() {
  const w = canvas.clientWidth;
  const h = canvas.clientHeight;
  camera.aspect = w / h;
  camera.updateProjectionMatrix();
  renderer.setSize(w, h, false);
}

// ── Model loading ────────────────────────────────
function loadModel() {
  const dracoLoader = new DRACOLoader();
  dracoLoader.setDecoderPath('/draco/');

  const loader = new GLTFLoader();
  loader.setDRACOLoader(dracoLoader);

  loader.load(
    '/model.glb',
    (gltf) => {
      model = gltf.scene;
      const box = new THREE.Box3().setFromObject(model);
      const size = box.getSize(new THREE.Vector3());
      const center = box.getCenter(new THREE.Vector3());

      // Auto-center and scale to ~2 units tall
      const maxDim = Math.max(size.x, size.y, size.z);
      const scale = 2 / maxDim;
      model.scale.setScalar(scale);

      const box2 = new THREE.Box3().setFromObject(model);
      const center2 = box2.getCenter(new THREE.Vector3());
      model.position.sub(center2);

      scene.add(model);

      // Find the mesh and rig it
      let mesh = null;
      model.traverse((child) => {
        if (child.isMesh && !mesh) mesh = child;
      });

      if (mesh) {
        // Create skeleton based on model bounds
        const meshBox = new THREE.Box3().setFromObject(mesh);
        // Transform box to model space
        rig = createHumanoidRig(meshBox);

        // Skin the mesh
        skinnedMesh = skinMeshToSkeleton(mesh, rig);

        // Replace original mesh with skinned mesh
        mesh.parent.add(skinnedMesh);
        mesh.parent.remove(mesh);

        // Skeleton helper
        skeletonHelper = new SkeletonHelper(skinnedMesh);
        skeletonHelper.visible = true;
        scene.add(skeletonHelper);

        // Update structure tree
        buildStructureTree(gltf);
        buildBoneTree();
        buildModelInfo(gltf, mesh);
      }

      // Focus camera
      const finalBox = new THREE.Box3().setFromObject(model);
      const finalCenter = finalBox.getCenter(new THREE.Vector3());
      controls.target.copy(finalCenter);
      controls.update();

      loadingEl.style.display = 'none';

      // Start with idle animation
      codeEditor.value = DEFAULT_CODE;
      runAnimation();
    },
    (progress) => {
      if (progress.total) {
        const pct = Math.round((progress.loaded / progress.total) * 100);
        loadingText.textContent = `Загрузка модели… ${pct}%`;
      }
    },
    (error) => {
      loadingText.textContent = 'Ошибка загрузки';
      loadingText.style.color = '#ff6666';
      console.error(error);
    }
  );
}

// ── Structure tree ────────────────────────────────
function buildStructureTree(gltf) {
  let html = '';
  html += `<div class="tree-node">📦 Scene</div>`;

  gltf.scene.children.forEach((child, i) => {
    html += `<div class="tree-indent tree-node">`;
    const icon = child.isMesh ? '🔷' : child.isSkinnedMesh ? '🟣' : '📁';
    html += `<span class="tree-icon">${icon}</span>${child.name || child.type}`;
    html += `</div>`;
    if (child.children.length > 0) {
      child.children.forEach((c, j) => {
        html += `<div class="tree-indent" style="padding-left:28px" class="tree-node">`;
        const ic = c.isBone ? '🦴' : '🔷';
        html += `<span class="tree-icon">${ic}</span>${c.name || c.type}`;
        html += `</div>`;
      });
    }
  });

  // Materials
  html += `<div class="tree-node" style="margin-top:6px">🎨 Материалы</div>`;
  const matSet = new Set();
  model.traverse((child) => {
    if (child.isMesh && child.material) matSet.add(child.material);
  });
  Array.from(matSet).forEach((mat, i) => {
    html += `<div class="tree-indent tree-node"><span class="tree-icon">🖌</span>${mat.name || 'material_' + i}</div>`;
  });

  // Textures
  html += `<div class="tree-node" style="margin-top:6px">🖼 Текстуры</div>`;
  const texSet = new Set();
  model.traverse((child) => {
    if (child.isMesh && child.material) {
      const mats = Array.isArray(child.material) ? child.material : [child.material];
      mats.forEach((m) => {
        for (const key of ['map', 'normalMap', 'roughnessMap', 'metalnessMap', 'emissiveMap']) {
          if (m[key]) texSet.add(m[key]);
        }
      });
    }
  });
  Array.from(texSet).forEach((tex, i) => {
    html += `<div class="tree-indent tree-node"><span class="tree-icon">📷</span>${tex.name || 'texture_' + i}</div>`;
  });

  structureTree.innerHTML = html;
}

// ── Bone tree ────────────────────────────────────
function buildBoneTree() {
  if (!rig) return;
  let html = '';
  function renderBone(bone, depth) {
    const indent = '  '.repeat(depth);
    html += `<div class="tree-node" style="padding-left:${12 + depth * 14}px">`;
    html += `<span class="tree-icon">🦴</span>${bone.name}</div>`;
    bone.children.forEach((child) => {
      if (child.isBone) renderBone(child, depth + 1);
    });
  }
  renderBone(rig.rootBone, 0);
  boneTree.innerHTML = html;
}

// ── Model info ───────────────────────────────────
function buildModelInfo(gltf, mesh) {
  const geo = mesh.geometry;
  const vertCount = geo.attributes.position.count;
  const triCount = geo.index ? geo.index.count / 3 : vertCount / 3;
  // Count materials and textures from scene traversal
  const matSet = new Set();
  const texSet = new Set();
  model.traverse((child) => {
    if (child.isMesh && child.material) {
      matSet.add(child.material);
      const mats = Array.isArray(child.material) ? child.material : [child.material];
      mats.forEach((m) => {
        for (const key of ['map', 'normalMap', 'roughnessMap', 'metalnessMap', 'emissiveMap']) {
          if (m[key]) texSet.add(m[key]);
        }
      });
    }
  });
  const materials = matSet.size;
  const textures = texSet.size;
  const bones = rig ? rig.boneList.length : 0;

  modelInfo.innerHTML = `
    <div class="info-row"><span>Вершин:</span><b>${vertCount.toLocaleString()}</b></div>
    <div class="info-row"><span>Треугольников:</span><b>${Math.round(triCount).toLocaleString()}</b></div>
    <div class="info-row"><span>Материалов:</span><b>${materials}</b></div>
    <div class="info-row"><span>Текстур:</span><b>${textures}</b></div>
    <div class="info-row"><span>Костей:</span><b>${bones}</b></div>
    <div class="info-row"><span>Скиннинг:</span><b style="color:#ff6b9d">авто</b></div>
  `;
}

// ── Animation system ────────────────────────────
function runAnimation() {
  const code = codeEditor.value;
  try {
    // Create the animation function from user code
    const fn = new Function('api', code);
    animationFn = fn;
    isPlaying = true;
    animTime = 0;
  } catch (err) {
    console.error('Animation code error:', err);
    alert('Ошибка в коде анимации: ' + err.message);
  }
}

function stopAnimation() {
  isPlaying = false;
  animationFn = null;
  if (rig) resetPose();
}

function resetPose() {
  if (!rig) return;
  rig.boneList.forEach((bone) => {
    bone.rotation.set(0, 0, 0);
    // Don't reset position for child bones (they have offsets)
  });
}

// ── Export ───────────────────────────────────────
async function exportGLB() {
  const { GLTFExporter } = await import('three/addons/exporters/GLTFExporter.js');
  const exporter = new GLTFExporter();
  exporter.parse(
    skinnedMesh || model,
    (result) => {
      const blob = new Blob([result], { type: 'model/gltf-binary' });
      const url = URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.href = url;
      a.download = 'sakura_character_rigged.glb';
      a.click();
      URL.revokeObjectURL(url);
    },
    (err) => console.error('Export error:', err),
    { binary: true }
  );
}

// ── UI wiring ────────────────────────────────────
function initUI() {
  // Preset selector
  presetSelect.addEventListener('change', () => {
    const preset = presetSelect.value;
    if (preset && PRESETS[preset]) {
      codeEditor.value = PRESETS[preset];
      runAnimation();
    }
    presetSelect.value = '';
  });

  // Run / Stop
  btnRun.addEventListener('click', runAnimation);
  btnStop.addEventListener('click', stopAnimation);

  // Skeleton toggle
  btnSkeleton.addEventListener('click', () => {
    btnSkeleton.classList.toggle('active');
    if (skeletonHelper) skeletonHelper.visible = btnSkeleton.classList.contains('active');
  });

  // Grid toggle
  btnGrid.addEventListener('click', () => {
    btnGrid.classList.toggle('active');
    if (gridHelper) gridHelper.visible = btnGrid.classList.contains('active');
  });

  // Wireframe toggle
  btnWireframe.addEventListener('click', () => {
    btnWireframe.classList.toggle('active');
    if (skinnedMesh) {
      skinnedMesh.material.wireframe = btnWireframe.classList.contains('active');
    }
  });

  // Reference toggle
  btnRef.addEventListener('click', () => {
    btnRef.classList.toggle('active');
    refOverlay.classList.toggle('visible');
  });

  // Reset pose
  btnResetPose.addEventListener('click', () => {
    resetPose();
    stopAnimation();
  });

  // Export
  btnExport.addEventListener('click', exportGLB);

  // Speed
  speedSlider.addEventListener('input', () => {
    animSpeed = parseFloat(speedSlider.value);
    speedValue.textContent = animSpeed.toFixed(1) + '×';
  });

  // Tab key in code editor
  codeEditor.addEventListener('keydown', (e) => {
    if (e.key === 'Tab') {
      e.preventDefault();
      const start = codeEditor.selectionStart;
      const end = codeEditor.selectionEnd;
      codeEditor.value = codeEditor.value.substring(0, start) + '  ' + codeEditor.value.substring(end);
      codeEditor.selectionStart = codeEditor.selectionEnd = start + 2;
    }
  });
}

// ── Render loop ──────────────────────────────────
function animate() {
  requestAnimationFrame(animate);

  const dt = clock.getDelta();

  if (isPlaying && animationFn && rig) {
    animTime += dt * animSpeed;
    try {
      animationFn({
        bones: rig.boneMap,
        time: animTime,
        dt: dt * animSpeed,
        THREE,
      });
    } catch (err) {
      console.error('Animation runtime error:', err);
      isPlaying = false;
    }
  }

  controls.update();
  renderer.render(scene, camera);
}

// ── Boot ─────────────────────────────────────────
initScene();
initUI();
loadModel();
animate();

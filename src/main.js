import * as THREE from 'three';
import { OrbitControls } from 'three/addons/controls/OrbitControls.js';
import { GLTFLoader } from 'three/addons/loaders/GLTFLoader.js';
import { DRACOLoader } from 'three/addons/loaders/DRACOLoader.js';

// ── Scene setup ──────────────────────────────────────────────
const container = document.getElementById('app');
const loadingEl = document.getElementById('loading');
const infoEl = document.getElementById('info');

const scene = new THREE.Scene();
scene.background = new THREE.Color(0x1a1a2e);

const camera = new THREE.PerspectiveCamera(45, window.innerWidth / window.innerHeight, 0.01, 100);
camera.position.set(0, 0.3, 3.2);

const renderer = new THREE.WebGLRenderer({ antialias: true, alpha: false });
renderer.setSize(window.innerWidth, window.innerHeight);
renderer.setPixelRatio(Math.min(window.devicePixelRatio, 2));
renderer.outputColorSpace = THREE.SRGBColorSpace;
renderer.toneMapping = THREE.ACESFilmicToneMapping;
renderer.toneMappingExposure = 1.0;
container.appendChild(renderer.domElement);

// ── Lights ────────────────────────────────────────────────────
const hemi = new THREE.HemisphereLight(0xffffff, 0x444466, 1.0);
scene.add(hemi);

const key = new THREE.DirectionalLight(0xffffff, 1.5);
key.position.set(2, 3, 4);
scene.add(key);

const fill = new THREE.DirectionalLight(0x8899ff, 0.5);
fill.position.set(-3, 1, 2);
scene.add(fill);

const rim = new THREE.DirectionalLight(0xffddaa, 0.8);
rim.position.set(0, 2, -4);
scene.add(rim);

// ── Controls ─────────────────────────────────────────────────
const controls = new OrbitControls(camera, renderer.domElement);
controls.enableDamping = true;
controls.dampingFactor = 0.08;
controls.minDistance = 0.5;
controls.maxDistance = 10;
controls.target.set(0, 0.3, 0);

// ── Grid ─────────────────────────────────────────────────────
const grid = new THREE.GridHelper(4, 20, 0x444466, 0x333344);
grid.position.y = -1;
scene.add(grid);

// ── Load model ────────────────────────────────────────────────
const dracoLoader = new DRACOLoader();
dracoLoader.setDecoderPath('/draco/');

const loader = new GLTFLoader();
loader.setDRACOLoader(dracoLoader);

let model = null;

loader.load(
  '/model.glb',
  (gltf) => {
    model = gltf.scene;

    // Auto-center and scale
    const box = new THREE.Box3().setFromObject(model);
    const size = box.getSize(new THREE.Vector3());
    const center = box.getCenter(new THREE.Vector3());

    const maxDim = Math.max(size.x, size.y, size.z);
    const scale = 2 / maxDim;
    model.scale.setScalar(scale);

    // Re-center after scaling
    const box2 = new THREE.Box3().setFromObject(model);
    const center2 = box2.getCenter(new THREE.Vector3());
    model.position.sub(center2);

    scene.add(model);

    // Adjust camera target to model center
    const finalBox = new THREE.Box3().setFromObject(model);
    const finalCenter = finalBox.getCenter(new THREE.Vector3());
    controls.target.copy(finalCenter);
    camera.position.set(0, finalCenter.y, 3.2 / scale * scale);
    controls.update();

    loadingEl.style.display = 'none';
    infoEl.style.display = 'block';

    // Show reference toggle
    document.getElementById('ref-toggle').style.display = 'block';
  },
  (progress) => {
    if (progress.total) {
      const pct = Math.round((progress.loaded / progress.total) * 100);
      loadingEl.innerHTML = `<div class="spinner"></div>Загрузка модели… ${pct}%`;
    }
  },
  (error) => {
    loadingEl.innerHTML = `<div style="color:#ff6666">Ошибка загрузки модели</div>`;
    console.error(error);
  }
);

// ── Reference image toggle ────────────────────────────────────
const refToggle = document.getElementById('ref-toggle');
const refPanel = document.getElementById('ref-panel');
const refImg = document.getElementById('ref-img');

refToggle.addEventListener('click', () => {
  if (refPanel.style.display === 'block') {
    refPanel.style.display = 'none';
  } else {
    if (!refImg.src) {
      refImg.src = '/reference.png';
    }
    refPanel.style.display = 'block';
  }
});

// ── Resize ───────────────────────────────────────────────────
window.addEventListener('resize', () => {
  camera.aspect = window.innerWidth / window.innerHeight;
  camera.updateProjectionMatrix();
  renderer.setSize(window.innerWidth, window.innerHeight);
});

// ── Render loop ──────────────────────────────────────────────
function animate() {
  requestAnimationFrame(animate);
  controls.update();
  renderer.render(scene, camera);
}
animate();

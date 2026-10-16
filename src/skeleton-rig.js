import * as THREE from 'three';

/**
 * Creates a humanoid skeleton rigged to the model's bounding box.
 * Returns { bones, boneMap, skeleton, rootBone }
 */
export function createHumanoidRig(box) {
  const size = box.getSize(new THREE.Vector3());
  const center = box.getCenter(new THREE.Vector3());
  const h = size.y; // full height
  const w = size.x; // full width

  // Proportional offsets from hips (relative to model space)
  const py = (offset) => center.y + offset * h;
  const px = (offset) => center.x + offset * w;
  const pz = (offset) => center.z + offset * size.z;

  const bones = {};
  const boneList = [];

  function makeBone(name, pos, parent) {
    const bone = new THREE.Bone();
    bone.name = name;
    bone.position.set(pos[0], pos[1], pos[2]);
    if (parent) parent.add(bone);
    bones[name] = bone;
    boneList.push(bone);
    return bone;
  }

  // ── Hips (root) ─────────────────────────────
  const hips = makeBone('Hips', [center.x, py(0.0), center.z], null);

  // ── Spine → Chest → Neck → Head ─────────────
  const spine = makeBone('Spine', [0, py(0.08), 0], hips);
  const chest = makeBone('Chest', [0, py(0.15), 0], spine);
  const neck = makeBone('Neck', [0, py(0.12), 0], chest);
  const head = makeBone('Head', [0, py(0.08), 0], neck);

  // ── Left arm ────────────────────────────────
  const shoulderL = makeBone('ShoulderL', [px(0.18), py(0.13), 0], chest);
  const upperArmL = makeBone('UpperArmL', [px(0.08), 0, 0], shoulderL);
  const lowerArmL = makeBone('LowerArmL', [px(0.10), py(-0.05), 0], upperArmL);
  const handL = makeBone('HandL', [px(0.08), py(-0.05), 0], lowerArmL);

  // ── Right arm ───────────────────────────────
  const shoulderR = makeBone('ShoulderR', [px(-0.18), py(0.13), 0], chest);
  const upperArmR = makeBone('UpperArmR', [px(-0.08), 0, 0], shoulderR);
  const lowerArmR = makeBone('LowerArmR', [px(-0.10), py(-0.05), 0], upperArmR);
  const handR = makeBone('HandR', [px(-0.08), py(-0.05), 0], lowerArmR);

  // ── Left leg ────────────────────────────────
  const upperLegL = makeBone('UpperLegL', [px(0.08), py(-0.05), 0], hips);
  const lowerLegL = makeBone('LowerLegL', [0, py(-0.20), 0], upperLegL);
  const footL = makeBone('FootL', [0, py(-0.20), pz(0.05)], lowerLegL);

  // ── Right leg ───────────────────────────────
  const upperLegR = makeBone('UpperLegR', [px(-0.08), py(-0.05), 0], hips);
  const lowerLegR = makeBone('LowerLegR', [0, py(-0.20), 0], upperLegR);
  const footR = makeBone('FootR', [0, py(-0.20), pz(0.05)], lowerLegR);

  const skeleton = new THREE.Skeleton(boneList);
  return { bones, boneMap: bones, boneList, skeleton, rootBone: hips };
}

/**
 * Convert a regular mesh to a SkinnedMesh with auto-computed weights.
 * Uses nearest-bone distance weighting.
 */
export function skinMeshToSkeleton(mesh, rig) {
  const geometry = mesh.geometry;
  const positions = geometry.attributes.position;
  const vertexCount = positions.count;

  // Compute bone world positions
  mesh.updateMatrixWorld(true);
  const boneWorldPositions = rig.boneList.map(bone => {
    const p = new THREE.Vector3();
    bone.getWorldPosition(p);
    return p;
  });

  // For each vertex, find 4 nearest bones and compute weights
  const joints = new Float32Array(vertexCount * 4);
  const weights = new Float32Array(vertexCount * 4);

  const v = new THREE.Vector3();
  const dists = new Float32Array(rig.boneList.length);

  for (let i = 0; i < vertexCount; i++) {
    v.fromBufferAttribute(positions, i);
    // Apply mesh world matrix to get world position
    v.applyMatrix4(mesh.matrixWorld);

    // Compute distances to all bones
    let maxDist = 0;
    for (let j = 0; j < rig.boneList.length; j++) {
      dists[j] = v.distanceTo(boneWorldPositions[j]);
      if (dists[j] > maxDist) maxDist = dists[j];
    }

    // Find 4 nearest bones
    const indices = [0, 1, 2, 3];
    // Partial selection sort for top 4
    for (let s = 0; s < 4; s++) {
      let minIdx = s;
      for (let j = s + 1; j < rig.boneList.length; j++) {
        if (dists[j] < dists[minIdx]) minIdx = j;
      }
      if (minIdx !== s) {
        [dists[s], dists[minIdx]] = [dists[minIdx], dists[s]];
        [indices[s], indices[minIdx]] = [indices[minIdx], indices[s]];
      }
    }

    // Inverse distance weighting
    let weightSum = 0;
    for (let k = 0; k < 4; k++) {
      const invDist = 1 / (dists[k] + 0.001);
      weights[i * 4 + k] = invDist;
      joints[i * 4 + k] = indices[k];
      weightSum += invDist;
    }
    // Normalize
    for (let k = 0; k < 4; k++) {
      weights[i * 4 + k] /= weightSum;
    }
  }

  // Create skinned mesh
  const skinnedMesh = new THREE.SkinnedMesh(geometry, mesh.material);
  skinnedMesh.name = mesh.name;
  skinnedMesh.position.copy(mesh.position);
  skinnedMesh.rotation.copy(mesh.rotation);
  skinnedMesh.scale.copy(mesh.scale);
  skinnedMesh.castShadow = mesh.castShadow;
  skinnedMesh.receiveShadow = mesh.receiveShadow;

  // Add skin indices and weights
  geometry.setAttribute('skinIndex', new THREE.Uint16BufferAttribute(joints, 4));
  geometry.setAttribute('skinWeight', new THREE.Float32BufferAttribute(weights, 4));

  // Add root bone
  skinnedMesh.add(rig.rootBone);
  skinnedMesh.bind(rig.skeleton);

  return skinnedMesh;
}

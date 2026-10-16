/**
 * Animation presets — code snippets the user can load and run.
 * Each preset is a function body that receives `api` with:
 *   api.bones  — map of bone name → THREE.Bone
 *   api.time   — elapsed seconds (scaled by speed)
 *   api.dt     — delta time
 *   api.THREE  — THREE namespace
 */
export const PRESETS = {
  idle: `// Idle — спокойное дыхание
const { bones, time, THREE } = api;

// Лёгкое дыхание
bones.Spine.rotation.x = Math.sin(time * 1.5) * 0.03;
bones.Chest.rotation.x = Math.sin(time * 1.5) * 0.02;

// Плавное движение головы
bones.Head.rotation.y = Math.sin(time * 0.5) * 0.08;
bones.Head.rotation.z = Math.sin(time * 0.3) * 0.03;

// Руки слегка покачиваются
bones.UpperArmL.rotation.z = 0.05 + Math.sin(time * 1.5) * 0.02;
bones.UpperArmR.rotation.z = -0.05 - Math.sin(time * 1.5) * 0.02;
`,

  walk: `// Walk — ходьба на месте
const { bones, time, THREE } = api;
const t = time * 2.5;
const sw = Math.sin(t);
const sw2 = Math.sin(t + Math.PI);

// Ноги
bones.UpperLegL.rotation.x = sw * 0.4;
bones.UpperLegR.rotation.x = sw2 * 0.4;
bones.LowerLegL.rotation.x = Math.max(0, -sw) * 0.5;
bones.LowerLegR.rotation.x = Math.max(0, -sw2) * 0.5;
bones.FootL.rotation.x = sw * 0.2;
bones.FootR.rotation.x = sw2 * 0.2;

// Руки (противоположно ногам)
bones.UpperArmL.rotation.x = sw2 * 0.3;
bones.UpperArmR.rotation.x = sw * 0.3;
bones.LowerArmL.rotation.x = Math.max(0, sw2) * 0.4;
bones.LowerArmR.rotation.x = Math.max(0, sw) * 0.4;

// Корпус покачивается
bones.Hips.position.y = Math.abs(Math.sin(t)) * 0.02;
bones.Spine.rotation.y = sw * 0.08;
bones.Head.rotation.y = sw * 0.05;
`,

  wave: `// Wave — приветствие рукой
const { bones, time, THREE } = api;
const t = time * 3;

// Правая рука вверх
bones.UpperArmR.rotation.z = -1.2;
bones.UpperArmR.rotation.x = -0.2;
bones.LowerArmR.rotation.x = -0.5;
bones.LowerArmR.rotation.z = Math.sin(t) * 0.3;

// Лёгкий наклон
bones.Spine.rotation.z = 0.05;
bones.Head.rotation.z = 0.08;
bones.Head.rotation.y = Math.sin(time * 0.5) * 0.05;
`,

  bow: `// Bow — традиционный поклон
const { bones, time, THREE } = api;
const phase = Math.sin(time * 0.8);
const bowAmount = Math.max(0, phase) * 0.5;

// Наклон корпуса
bones.Hips.rotation.x = bowAmount * 0.3;
bones.Spine.rotation.x = bowAmount * 0.4;
bones.Chest.rotation.x = bowAmount * 0.3;
bones.Neck.rotation.x = bowAmount * 0.2;
bones.Head.rotation.x = bowAmount * 0.1;

// Руки прижаты
bones.UpperArmL.rotation.x = bowAmount * 0.2;
bones.UpperArmR.rotation.x = bowAmount * 0.2;
bones.LowerArmL.rotation.x = bowAmount * 0.3;
bones.LowerArmR.rotation.x = bowAmount * 0.3;
`,

  dance: `// Dance — танец
const { bones, time, THREE } = api;
const t = time * 2;
const beat = Math.sin(t * 2);

// Бёдра качаются
bones.Hips.rotation.z = Math.sin(t) * 0.12;
bones.Hips.rotation.y = Math.sin(t * 0.5) * 0.15;
bones.Spine.rotation.z = -Math.sin(t) * 0.08;
bones.Spine.rotation.y = Math.sin(t * 0.5) * 0.1;

// Руки в стороны
bones.UpperArmL.rotation.z = 0.5 + Math.sin(t) * 0.3;
bones.UpperArmR.rotation.z = -0.5 - Math.sin(t) * 0.3;
bones.LowerArmL.rotation.x = Math.sin(t + 1) * 0.4;
bones.LowerArmR.rotation.x = Math.sin(t + 1) * 0.4;

// Голова в такт
bones.Head.rotation.y = Math.sin(t) * 0.15;
bones.Head.rotation.z = Math.sin(t * 0.5) * 0.08;

// Колени пружинят
bones.UpperLegL.rotation.x = Math.abs(beat) * 0.15;
bones.UpperLegR.rotation.x = Math.abs(beat) * 0.15;
`,
};

export const DEFAULT_CODE = PRESETS.idle;

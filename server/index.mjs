import http from 'node:http';

const PORT = 3001;
const OPENAI_API_KEY = process.env.OPENAI_API_KEY || '';
const MODEL = process.env.OPENAI_MODEL || 'gpt-4o-mini';

const SYSTEM_PROMPT = `Ты — аниматор 3D-персонажа для игры "Sakura Japanese Life".
У тебя есть гуманоидный персонаж со следующими костями:
- Hips (корень), Spine, Chest, Neck, Head
- ShoulderL, UpperArmL, LowerArmL, HandL (левая рука)
- ShoulderR, UpperArmR, LowerArmR, HandR (правая рука)
- UpperLegL, LowerLegL, FootL (левая нога)
- UpperLegR, LowerLegR, FootR (правая нога)

API анимации:
- bones — объект с костями по имени (bones.UpperArmL.rotation.x = 0.5)
- time — прошедшее время в секундах (float)
- THREE — namespace Three.js

Ты можешь менять: bone.rotation.x/y/z, bone.position.x/y/z, bone.scale.x/y/z.
Углы в радианах (0.5 рад ≈ 28°). Используй Math.sin/cos для цикличных анимаций.
Код выполняется КАЖДЫЙ КАДР с текущим time.

Когда просишь анимацию — отвечай кратко по-русски и ВСЕГДА добавляй блок кода:
\`\`\`js
const { bones, time, THREE } = api;
const t = time * 2;
bones.UpperArmL.rotation.x = Math.sin(t) * 0.5;
\`\`\`

Если просят статичную позу — просто задай значения без sin/cos.`;

async function callOpenAI(messages) {
  const resp = await fetch('https://api.openai.com/v1/chat/completions', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${OPENAI_API_KEY}`,
    },
    body: JSON.stringify({
      model: MODEL,
      messages: [{ role: 'system', content: SYSTEM_PROMPT }, ...messages],
      temperature: 0.7,
    }),
  });
  if (!resp.ok) {
    const txt = await resp.text();
    throw new Error(`OpenAI ${resp.status}: ${txt}`);
  }
  const data = await resp.json();
  return data.choices[0].message.content;
}

const server = http.createServer(async (req, res) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'POST, OPTIONS');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type');

  if (req.method === 'OPTIONS') { res.writeHead(204); res.end(); return; }

  if (req.method === 'POST' && req.url === '/api/chat') {
    let body = '';
    for await (const chunk of req) body += chunk;
    try {
      const { messages } = JSON.parse(body);
      const reply = await callOpenAI(messages);
      res.writeHead(200, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify({ reply }));
    } catch (err) {
      res.writeHead(500, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify({ error: err.message }));
    }
    return;
  }

  if (req.method === 'GET' && req.url === '/api/health') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ ok: true, hasKey: !!OPENAI_API_KEY }));
    return;
  }

  res.writeHead(404);
  res.end('Not found');
});

server.listen(PORT, () => console.log(`API server on :${PORT} (key: ${OPENAI_API_KEY ? 'yes' : 'NO'})`));

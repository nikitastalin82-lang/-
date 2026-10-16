/**
 * Chat module — talks to the backend proxy which calls OpenAI.
 * Extracts JS code blocks from GPT replies and runs them as animations.
 */

export function initChat(onCodeReceived) {
  const messagesEl = document.getElementById('chat-messages');
  const inputEl = document.getElementById('chat-input');
  const sendBtn = document.getElementById('chat-send');

  const history = [];

  function addMsg(role, text) {
    const div = document.createElement('div');
    div.className = `chat-msg ${role}`;
    div.innerHTML = text;
    messagesEl.appendChild(div);
    messagesEl.scrollTop = messagesEl.scrollHeight;
    return div;
  }

  function escapeHtml(s) {
    return s.replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;');
  }

  async function send() {
    const text = inputEl.value.trim();
    if (!text) return;

    inputEl.value = '';
    addMsg('user', escapeHtml(text));

    // Check if API key is configured
    try {
      const health = await fetch('/api/health').then(r => r.json()).catch(() => null);
      if (health && !health.hasKey) {
        addMsg('error', '⚠ OpenAI API ключ не настроен. Добавьте OPENAI_API_KEY в Secrets.');
        return;
      }
    } catch { /* backend might not be up yet, try anyway */ }

    history.push({ role: 'user', content: text });

    const loadingEl = addMsg('assistant', '⏳ Думаю…');

    try {
      const resp = await fetch('/api/chat', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ messages: history }),
      });

      const data = await resp.json();

      if (!resp.ok || data.error) {
        throw new Error(data.error || `HTTP ${resp.status}`);
      }

      const reply = data.reply;
      history.push({ role: 'assistant', content: reply });

      // Extract code block
      const codeMatch = reply.match(/```js\n([\s\S]*?)```/);

      // Render reply with code highlighted
      let html = escapeHtml(reply.replace(/```js\n([\s\S]*?)```/g, '').trim());
      if (codeMatch) {
        html += `<code>${escapeHtml(codeMatch[1])}</code>`;
      }
      if (!html.trim()) html = '(код сгенерирован)';
      loadingEl.innerHTML = html;

      // Auto-run the code
      if (codeMatch && onCodeReceived) {
        onCodeReceived(codeMatch[1]);
        addMsg('system', '✅ Код загружен и запущен');
      }
    } catch (err) {
      loadingEl.className = 'chat-msg error';
      loadingEl.innerHTML = `❌ ${escapeHtml(err.message)}`;
    }
  }

  sendBtn.addEventListener('click', send);
  inputEl.addEventListener('keydown', (e) => {
    if (e.key === 'Enter' && !e.shiftKey) {
      e.preventDefault();
      send();
    }
  });

  // Welcome message
  addMsg('assistant', 'Привет! Опиши анимацию — я сгенерирую код и запущу её. Например: "помаши рукой", "сделай поклон", "танцуй".');
}

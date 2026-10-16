import { defineConfig } from 'vite'

export default defineConfig({
  server: {
    host: '0.0.0.0',
    port: 5173,
    proxy: {
      '/api': {
        target: process.env.BASE44_PREVIEW_MODE === '1' ? 'http://api:3001' : 'http://localhost:3001',
        changeOrigin: true,
      },
    },
  },
  assetsInclude: ['**/*.glb'],
})

// Lấy biến môi trường từ Vite
export const { VITE_BASE_URL_SERVER } = import.meta.env || {};
export const { VITE_BASE_URL_CLIENT } = import.meta.env || {};
export const { VITE_BASE_URL_CLIENT_SOCKET } = import.meta.env || {};

// API URL gốc (có thể dùng cho mọi request sau này)
export const API_URL = `${VITE_BASE_URL_SERVER}/api/v1`;

// Ví dụ endpoint (có thể xóa hoặc sửa lại khi cần)
export const EXAMPLE_API_ENDPOINT = `${API_URL}/example`;

import axios from "axios";
import { PRODUCTS_API_URL } from "../constants/ApiConstants";

export function getAllProducts() {
    return axios.get(`${PRODUCTS_API_URL}/getAll`);
}

export function saveProduct(product) {
    return axios.post(`${PRODUCTS_API_URL}/save`, product);
}

export function removeProduct(id) {
    return axios.delete(`${PRODUCTS_API_URL}/remove/${id}`);
}

export function getProductById(id) {
    return axios.get(`${PRODUCTS_API_URL}/getById/${id}`, { "Authorization": `Bearer ${localStorage.getItem("authToken")}` });
}
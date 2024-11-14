import axios from "axios";
import { ADMIN_API_URL } from "../constants/ApiConstants";

export function login(credentials){
    return axios.post(`${ADMIN_API_URL}/login`,credentials);
}

export function storeToken(token){
    localStorage.setItem("auth_token",token);
}

export function getToken(){
    return localStorage.getItem("auth_token");
}

export function removeToken(){
    localStorage.removeItem("auth_token");
}
import express from "express";
import { connectDb } from "./dbConfig.js";

const APP = express();
APP.use(express.json());

APP.get("/", (request, response)=>{
    response.send("Hello");
});

APP.listen(4500, ()=>{
    console.log("Server started....");
    connectDb();
})
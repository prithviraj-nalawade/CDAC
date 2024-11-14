import express, { response } from 'express';
import mongoose from 'mongoose';
import cors from 'cors';
import { Product } from './ProductModal.js';

async function connectDb(){
    try{
        await mongoose.connect("mongodb://127.0.0.1:27017/demodb");
        console.log("Connected to mongoose..")
    }catch(error){
        console.log(error)
    }
}

const app = express();



app.use(express.json());
app.use(cors());

app.post("/save-product", async (request, response)=>{
    try{
        const data = request.body;
        const p = new Product(data);
        const savedProduct = await p.save();
        console.log(savedProduct);
        response.status(200).send(savedProduct);
    }catch(error){
        response.status(500).send({message: "Error saving product"});
    }
})

app.get("/get-all", async (request, response)=>{
    try{
       const data = await Product.find();
        console.log(data);
        response.status(200).send(data);
    }catch(error){
        response.status(500).send({message: "Error saving product"});
    }
})

app.listen(9600, ()=>{
    console.log("Server started....");
    connectDb();
})
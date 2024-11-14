import { createConnectionObject } from "../config/DbConfig.js";

const connection = createConnectionObject();

export function saveProduct(request,response){
    try {
        const product = request.body;
        console.log(product);
        const insertQry = `INSERT INTO product VALUES(${product.id},'${product.name}',${product.price},${product.quantity},'${product.description}')`;
        connection.query(insertQry,(error)=>{
            if(error){
                console.log(error);
                response.status(500).send({message:"Something went wrong"});
            }
            else response.status(201).send({message:"Product saved successfully"});
        })
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});
    }
}

export function getAllProducts(request,response){
    try {
        const fetchQry = "SELECT * FROM product";
        connection.query(fetchQry,(error,result)=>{
            if(error){
                console.log(error);
                response.status(500).send({message:"Something went wrong"});
            }
            else response.status(200).send(result);
        })
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});
    }
}

export function removeProductById(request,response){
    try {
       const productId = request.params.id; 
       const deleteQry = `DELETE FROM product WHERE id=${productId}`;
       connection.query(deleteQry,(error)=>{
            if(error){
                response.status(500).send({message:"Something went wrong"});
            }
            else{
                response.status(200).send({message:"Product deleted successfully"});
            }
       });
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});   
    }
}

export function getProductById(request,response){
    try {
        const fetchQry = "SELECT * FROM product WHERE id ="+request.params.id;
        connection.query(fetchQry,(error,result)=>{
            if(error){
                console.log(error);
                response.status(500).send({message:"Something went wrong"});
            }
            else if(result.length>0) response.status(200).send(result[0]);
            else response.status(404).send({message:"Product not found"});
        })
    } catch (error) {
        console.log(error)
        response.status(500).send({message:"Something went wrong"});
    }
}
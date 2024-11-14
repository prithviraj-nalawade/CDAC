import { createConnection } from "mysql2";

export const connectionObj = ()=>{
const connection = createConnection({
    host:"localhost",
    user:"prithviraj",
    password:"cdac",
    database:"cdacmumbai"
})
return connection;

}

export const connectionConfig = () =>{
connectionObj().connect((err)=>{
    if(err){
        console.log(err);
    }else{
        console.log("Database Connected...");
        
    }


})

}
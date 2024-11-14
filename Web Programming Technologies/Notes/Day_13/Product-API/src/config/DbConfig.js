import { createConnection } from "mysql2";

export function createConnectionObject(){
    return createConnection({
        host: "localhost",
        user: "prithviraj",
        password: "cdac",
        database: "cdacmumbai"
    });
}

export function establishConnection(){
    createConnectionObject().connect((error)=>{
        if (error) {
            console.log(error);
        }
        else{
            console.log("Connected to MySQL Database!");
        }
    });
}
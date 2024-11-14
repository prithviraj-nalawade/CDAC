import { connectionObj } from "../config/dbConfig.js";


export function addEmployees(request, response){
    try {
        const data = request.body;
        const query = `insert into employee values (${data.id}, '${data.name}', '${data.city}', '${data.department}')`;
        connectionObj().query(query, (err)=>{
            if(err){
                response.status(404).send({ message: "Something went wrong!!" }); 
            }
            else{
                response.status(201).send({message:"data added successfully!!"});
            }
        })

    } catch (error) {
        console.log(error);
        response.status(501).send({ message: "Something went wrong!!" });
    }
}

export  function getEmployees(request, response) {
    try {
        var query = "select * from employee";
        connectionObj().query(query, (error, result) => {
            if (error) {
                response.status(404).send({ message: "Something went wrong!!" });
            } else {
                response.status(201).send(result);
            }
        })


    } catch (error) {
        response.status(501).send({ message: "Something went wrong!!" });
    }
}

export function updateEmployees(request, response){
    try {
        const data = request.body;
        const id = request.params.id;
        const query = `update employee set name='${data.name}' where id=${id}`;
        
        connectionObj().query(query, (err)=>{
            if(err){
                console.log(err);
                response.status(404).send({ message: "Something went wrong!!" });
            }
            else{
                response.status(201).send({message:"data updated successfully!!"});
            }
        })
        
    } catch (error) {
        response.status(501).send({ message: "Something went wrong!!" });
    }
}
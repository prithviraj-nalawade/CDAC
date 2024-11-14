* Day_12
  - 

* npm init -y 
  - with -y it will consider the default values suggested by npm init command

* Middleware:
    - client -> 
    - request arrival -> Middleware -> request process
    - it is a function/logic that will be executed before the request is getting processed
    - when request arrives on server, first middleware will be called then after middleware request will be processed

* e.g. app.get("/sum", authenticateUser(), (req, res)=>{

});

* Note: by default express app doesn't process the request body i.e. express app doesn't know by default that requests may contain the data into the body.
* Now its the developer who has to specify that express app should process the request body.
* so to specify that any url msut process the request body, we are getting a  middleware defined in express (express.json())
* with the help of express.json() middleware we are enabling a url to process the request body


* It may be a case where we need to call a middleware for every route
  - app.use(middleware);
  - e.g. app.use(express.json()); *register a middleware that has to be called on each and every rout of the express app*

```JS
  import express from 'express';

const app = express();
app.use(express.json());
const PORT = 5600


app.get("/", (request, response)=>{
    response.send("Welcome to the app");
});

app.post("/sum", (request, response)=>{
       const a = request.body.n1;
       const b = request.body.n2;

       response.send({sum: a+b});
})

app.listen(PORT, ()=>{
    console.log(`Server is running at http://localhost:${PORT}`);
})
```
```JS
import express, { response } from 'express';
import { connectDb } from './dbConfig';

const APP = express();
APP.use(express.json());
const PORT = 5600
const STUDENTS_LIST = [

];


APP.get("/", (request, response) => {
    response.send("Welcome to the APP");
});

APP.post("/register-student", (request, response) => {
    try {
        const data = request.body; // {id: 11, name: ""};
        STUDENTS_LIST.push(data)
        response.status(201).send({ message: "Registered Successfull" })
    } catch (err) {
        response.status(500).send({ message: "Something went wrong" })
    }


})

APP.get("/students", (request, response)=>{
    try{
        response.send(STUDENTS_LIST);
    }catch(err){
        response.status(500).send({ message: "Something went wrong" })
    }
})

APP.listen(PORT, () => {
    console.log(`Server is running at http://localhost:${PORT}`);
    
})
```
* Data connectivity:
  - user -> app -> Database

* MVC design pattern:
    - Model: Represent entities / data (class)
       * class Employee{
        constructor(id, name, salary, department, phone){
            this.id = id;
            this.name = name;
            this.department = department;
            this.phone = phone;
        }
       }

       const data = request.body;
       var emp = new Employee(data.id, data.name, data.salary, data.department)
       `insert into employee values(${emp.id}, '${emp.name}')`
    - View -> UI
    - Controller: responsible for processinh the request and generating the response

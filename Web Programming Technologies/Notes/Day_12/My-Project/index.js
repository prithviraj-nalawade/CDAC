import express, { response } from 'express';
// import { connectDb } from './dbConfig.js';

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

APP.get("/students", (request, response) => {
    try {
        response.send(STUDENTS_LIST);
    } catch (err) {
        response.status(500).send({ message: "Something went wrong" })
    }
})

APP.post("/sum", (request, response) => {
    const a = request.body.n1;
    const b = request.body.n2;

    response.send({ sum: a + b });
})

APP.listen(PORT, () => {
    console.log(`Server is running at http://localhost:${PORT}`);
    // connectDb();
})
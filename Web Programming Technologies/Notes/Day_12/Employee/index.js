import express from "express";
import { connectionConfig } from "./src/config/dbConfig.js";
import { addEmployees, getEmployees, updateEmployees } from "./src/controller/employee.js";

const app = express();
app.use(express.json());

app.get("/", (request, response) => {
    response.status(201).send({ message: "Connection success" })
})

app.post("/add", addEmployees);

app.get("/fetch", getEmployees);

app.put("/update/:id", updateEmployees);

app.listen(4600, () => {
    console.log("Server started....");
    connectionConfig();
})
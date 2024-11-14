import { createConnectionObject } from "../config/DbConfig.js";
import bcrypt from "bcrypt";
import jwt from "jsonwebtoken";

const connection = createConnectionObject();
export function registerAdmin(response, request) {
    try {
        const requestData = request.body;
        const encryptedPassword = bcrypt.hashSync(requestData.password, 12);

        const insertQry = `insert into admin values(${requestData.id}, '${requestData.name}','${requestData.username}', '${encryptedPassword}', '${requestData.phone}')`;

        connection.query(insertQry, (error) => {
            if (error) {
                response.status(500).send({ message: "Something went wrong" });
            }
            else {
                response.status(201).send({ message: "admin registered.." })
            }
        })


    } catch (error) {
        response.status(500).send({ message: "Something went wrong" });
    }
}

export function adminLogin(request, response) {
    try {
        const requestData = request.body;
        const selectQry = `select * from admin where username='${requestData.username}'`;

        connection.query(selectQryQry, (error, result) => {
            if (error) {
                response.status(500).send({ message: "Something went wrong" });
            }
            else {
                if (result.length > 0) {
                    if (bcrypt.compareSync(requestData.body.password, result[0].password)) {
                        //generate token
                        jwt.sign({ adminId: result[0].id }, "hello123", (error, token) => {
                            if (error) response.status(500).send({ message: "Something went wrong" });
                            else {
                                response.status(200).send({ message: "Token Generated successfully", token });
                            }
                        })

                    }
                    else {
                        response.status(400).send({ message: "Password is incorrect" });
                    }
                }
                else {
                    response.status(400).send({ message: "UserName not found" });
                }
            }
        })


    } catch (error) {
        response.status(500).send({ message: "Something went wrong" });
    }
}
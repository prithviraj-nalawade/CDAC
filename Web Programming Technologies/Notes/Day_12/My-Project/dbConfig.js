import { createConnection } from "mysql";


export function connectDb() {
    const connectionConfig = createConnection({
        host: "localhost",
        user: "prithviraj",
        password: "cdac",
        database: "cdacmumbai"
    })

    connectionConfig.connect((err) => {
        if (err) {
            console.log(err);
        } else {
            console.log("Connected to database");
        }
    })
}
import express from 'express';
import { establishConnection } from './src/config/DbConfig.js';
import productRouter from './src/router/ProductRouter.js';
import adminRouter from './src/router/AdminRouter.js';
import cors from 'cors';

const app = express();
app.use(cors())
app.use(express.json());
app.use("/products",productRouter);
app.use("/admins",adminRouter);

app.listen(9800,()=>{
    console.log('Server is running on port 9800');
    establishConnection();
});
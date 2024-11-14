import { Router } from "express";
import { getAllProducts, getProductById, removeProductById, saveProduct } from "../controller/ProductController.js";
import { verifyToken } from "../middleware/VerifyToken.js";

const productRouter = Router();

productRouter.post("/save",verifyToken,saveProduct);
productRouter.get("/getAll",verifyToken,getAllProducts);
productRouter.delete("/remove/:id",verifyToken,removeProductById);
productRouter.get("/getById/:id",verifyToken,getProductById);


export default productRouter;
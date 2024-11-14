import { registerAdmin } from "../controller/AdminController.js";
import { Router } from express;

const adminRouter = Router();

adminRouter.post("/register", registerAdmin);
import { useEffect, useState } from "react";
import {getAllProducts} from './services/ProductService'
export function Home(){
    const [products, setProducts] = useState([]);

    const getAllProductsData = async () =>{
        const data = await getAllProducts();
        setProducts(data);
    }
    useEffect(()=>{
       getAllProductsData();
    }, []);
    return(
        <div>
                <h1>Welcome to Home</h1>
                <p>This is Home. </p>
                <div>
                    <table border={1} cellPadding={10} cellSpacing={0}>
                        <thead>
                            <th>id</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Description</th>
                            <th>Quantity</th>
                            <th>Actions</th>
                        </thead>
                        <tbody>
                            {
                                products.map((p) => {
                                    return (
                                        <tr>
                                            <td>{p.id}</td>
                                            <td>{p.name}</td>
                                            <td>{p.price}</td>
                                            <td>{p.description}</td>
                                            <td>{p.quantity}</td>
                                            <td>
                                                <button>Edit</button>
                                                <button>Delete</button>
                                            </td>
                                        </tr>
                                    )
                                })
                            }
                        </tbody>
                    </table>
                </div>
                {
                    products.length > 0 ?
                        products.map((p) => {
                            return (
                                < div className="card">
                                    <div className="card-header">{`${p.name}, Price: ${p.price}`}</div>
                                    <div className="card-body">{p.description}</div>
                                    <div className="card-footer"></div>
                                </div>

                            )
                        })
                        :
                        <h2>No products found</h2>
                }
            </div>
    );
}


// import { Component } from "react";
// import "./assets/styles/Home.css"
// import { getAllProducts } from "./services/ProductService";

// export class Home extends Component {
//     constructor() {
//         super();
//         this.state = {
//             products: []
//         }
//     }

//     render() {
//         return (
            // <div>
            //     <h1>Welcome to Home</h1>
            //     <p>This is Home. </p>
            //     <div>
            //         <table border={1} cellPadding={10} cellSpacing={0}>
            //             <thead>
            //                 <th>id</th>
            //                 <th>Name</th>
            //                 <th>Price</th>
            //                 <th>Description</th>
            //                 <th>Quantity</th>
            //                 <th>Actions</th>
            //             </thead>
            //             <tbody>
            //                 {
            //                     this.state.products.map((p) => {
            //                         return (
            //                             <tr>
            //                                 <td>{p.id}</td>
            //                                 <td>{p.name}</td>
            //                                 <td>{p.price}</td>
            //                                 <td>{p.description}</td>
            //                                 <td>{p.quantity}</td>
            //                                 <td>
            //                                     <button>Edit</button>
            //                                     <button>Delete</button>
            //                                 </td>
            //                             </tr>
            //                         )
            //                     })
            //                 }
            //             </tbody>
            //         </table>
            //     </div>
            //     {
            //         this.state.products.length > 0 ?
            //             this.state.products.map((p) => {
            //                 return (
            //                     < div className="card">
            //                         <div className="card-header">{`${p.name}, Price: ${p.price}`}</div>
            //                         <div className="card-body">{p.description}</div>
            //                         <div className="card-footer"></div>
            //                     </div>

            //                 )
            //             })
            //             :
            //             <h2>No products found</h2>
            //     }
            // </div>
//         )
//     }

//     async componentDidMount() {
//         const data = await getAllProducts();
//         this.setState({products: data})
    
//     }
// }

// // export function Home(){
// //     return(
// //         <div>
// //             <h1>Welcome to Home</h1>
// //             <p>This is Home. </p>
// //         </div>
// //     )
// // }


import { useState } from "react"

export function RegisterationForm() {
    const [formData, setFormData] = useState({ firstname: "", lastname: "", email: "", password: "" });

    const handleInputChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        })
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(formData);
    }
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input type="text" name="firstname" placeholder="Enter First Name" onChange={handleInputChange}></input>
                <input type="text" name="lastname" placeholder="Enter Last Name" onChange={handleInputChange}></input>
                <input type="email" name="email" placeholder="Enter Email" onChange={handleInputChange}></input>
                <input type="password" name="password" placeholder="Enter Password" onChange={handleInputChange}></input>
                <button type="submit">Register</button>
            </form>
        </div>

    )
}






//class compoent:

// import { Component } from "react";

// export class RegisterationForm extends Component {
//     constructor() {
//         super();
//         this.state = {
//             formData: {
//                 firstname: "",
//                 lastname: "",
//                 email: "",
//                 password: ""
//             }

//         }
//         this.handleInputChange = this.handleInputChange.bind(this);
//         this.handleSubmit = this.handleSubmit.bind(this);
//     }

//     handleInputChange(e) {
//         //read the value from the first name field
//         //assign that value into formData state
//         this.setState({
//             formData: {
//                 ...this.state.formData,
//                 [e.target.name]: e.target.value
//             }

//         });

//     }

//     handleSubmit(e) {
//         e.preventDefault();
//         console.log(this.state.formData);
//     }

//     render() {
//         return (
//             <div>
//                 <form onSubmit={this.handleSubmit}>
//                     <input type="text" name="firstname" placeholder="Enter First Name" onChange={this.handleInputChange}></input>
//                     <input type="text" name="lastname" placeholder="Enter Last Name" onChange={this.handleInputChange}></input>
//                     <input type="email" name="email" placeholder="Enter Email" onChange={this.handleInputChange}></input>
//                     <input type="password" name="password" placeholder="Enter Password" onChange={this.handleInputChange}></input>
//                     <button type="submit">Register</button>
//                 </form>
//             </div>
//         )
//     }
// }
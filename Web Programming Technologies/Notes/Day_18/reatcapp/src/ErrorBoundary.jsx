import { Component } from "react";

export class ErrorBoundary extends Component {
    constructor() {
        super();
        this.state = { error: null, erroInfo: null };
    }
    componentDidCatch(error, erroInfo) {
        // console.log(error, erroInfo);
        this.setState({ error: error, erroInfo: erroInfo });
    }

    render() {
        if (this.state.error) {
            return <h1>Something went wrong</h1>
        }
        return this.props.children
    }
}
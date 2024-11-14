import { Navbar, Container, Nav } from "react-bootstrap"
import { ROUTES } from "../constants/constants"
import { LinkContainer } from 'react-router-bootstrap'
export function NavigationBar() {
    return (
        <Navbar bg="dark" data-bs-theme="dark">
            <Container>
                <Navbar.Brand href="">Navbar</Navbar.Brand>
                <Nav className="me-auto">
                    <LinkContainer to={ROUTES.HOME}>
                        <Nav.Link>Home</Nav.Link>
                     </LinkContainer>
                     <LinkContainer to={ROUTES.ABOUT}>
                        <Nav.Link>App Form</Nav.Link>
                     </LinkContainer>
                     <LinkContainer to={ROUTES.PRODUCT}>
                        <Nav.Link>Home</Nav.Link>
                     </LinkContainer>
                </Nav>
            </Container>
        </Navbar>

    )
}
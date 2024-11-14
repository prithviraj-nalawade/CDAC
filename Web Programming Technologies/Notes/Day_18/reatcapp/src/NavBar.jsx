import { Section } from "./Section"
export function Navbar() {
    return (
        <div>
            <nav>
                <Section leftBox={<a href="#">Left Side</a>} rightBox={<a href="#">Right Side</a>}>
                    <h1>Child Heading</h1>
                </Section>
                <div><a href="#">Home</a></div>
                <div><a href="#">About</a></div>
                <div><a href="#">Contact</a></div>
            </nav>
        </div>
    )
}
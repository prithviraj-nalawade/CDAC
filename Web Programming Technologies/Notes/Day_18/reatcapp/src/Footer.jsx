import { Section } from "./Section"
export function Footer() {
    return (
        <div>
            <nav>
                <div><a href="#">Social Media</a></div>
                <div><a href="#">Youtube</a></div>
                <div><a href="#">Map Location</a></div>
                <Section leftBox={<h1>Left Side</h1>} rightBox={<h1>Right Box</h1>}></Section>
            </nav>
        </div>
    )
}
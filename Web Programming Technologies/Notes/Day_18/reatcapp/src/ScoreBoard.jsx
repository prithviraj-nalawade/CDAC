import { useState } from "react";

export function ScoreBoard(){
    const [counter, setCounter] = useState(0)

    const handleCount = (e) =>{
        setCounter(counter+1);
    }

    if(counter === 5){
        throw new Error("Invalid counter value")
    }

    return(
        <div>
            <h1>{counter}</h1>
            <button onClick={handleCount}>increment</button>
        </div>
    )
}
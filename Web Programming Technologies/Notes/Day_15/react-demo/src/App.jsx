import { useState } from 'react'
import { RegisterationForm } from './RegisterationForm'


function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <RegisterationForm></RegisterationForm>
    </>
  )
}

export default App

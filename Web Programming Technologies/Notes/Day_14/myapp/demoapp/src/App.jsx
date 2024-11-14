import { useState } from 'react'

import { MyComponent } from './MyComponent'
import { NavigationBar } from './NavigationBar'
import { Greet } from './Greet'

function App() {


  return (
    <>
      <NavigationBar></NavigationBar>
      <h1>hello world</h1>
      <MyComponent></MyComponent>
      <Greet personName="Prithviraj" email="prithviraj@gmail.com"></Greet>
    </>
  )
}

export default App

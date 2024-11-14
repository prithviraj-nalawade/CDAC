
// import {Button, Col, Container, Row} from 'react-bootstrap'

import { NavigationBar } from './components/NavigationBar';
import { BrowerserRouter } from 'react-router-dom';
import { AppRouter } from './components/AppRouter';


function App() {

  return (
    <BrowerserRouter>
    
      <NavigationBar></NavigationBar>
    

    </BrowerserRouter>
  )
}

export default App

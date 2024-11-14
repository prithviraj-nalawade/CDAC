import { NavigationBar } from './NavigationBar';
import { AppRouter } from './AppRouter';

import { BrowserRouter, Route, Routes } from "react-router-dom";
function App() {

  return (
    <BrowserRouter>
      <div>
        <NavigationBar />
        <AppRouter />
      </div>
    </BrowserRouter>

  )
}

export default App

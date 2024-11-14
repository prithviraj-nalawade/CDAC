
import { ErrorBoundary } from './ErrorBoundary'
import { Footer } from './Footer'
import { Navbar } from './NavBar'
import { ScoreBoard } from './ScoreBoard'

function App() {


  return (
    <>
      <Navbar />
      <ErrorBoundary>
        <ScoreBoard />
      </ErrorBoundary>

      <Footer></Footer>
    </>
  )
}

export default App

* Day_16
  - 

* Routing
  - Home: base-url -> localhost:5173/
  - About: -> localhost:5173/about
  - Contact -> localhost:5173/contact

* Mount -> Componet is going to render on the browser
* Unmount -> Component is getting removed from the screen

* React JS doesn't provides routing
* To achieve it we will use react-router-dom
   - *npm i react-router-dom*

* Components of react-router-dom
  - *BrowserRouter* -> to enable the routing within react app, we have to wrap all the components inside the BrowserRouter
  - *Routes* -> it is container for containg all the Route components
  - Route -> will contain the mapping of url with the component

* Lifecycle of Component:
  - From thr starting/mounting to unmouting phase there are sequence of methods called on any component, and those are known lifecycle functions

* lifecycle functions for class component:
  - *constructor()* -> executes only 1 time
  - *render()*-> 1st time it will be executed, the no. of times the state has been updated
  - *componentDidMount()*-> it will be called just after the first render only. e.g. to fetch data from api call at the time of component mounting
  - *componentDidUpdate()*-> it will be called whenever component is updated due to re-rendering because of the state update
  - *componentShouldUpdate()*-> before calling didUpdate, shouldUpdate() will be called 
  - *componentDidCatch()*-> it will handle the errors occuring in the component, ErrorBoundary
  - *componentWillUnmount()*-> it will be called ust before the component is getting unmounted, so that we can perform certain cleanup task

* List rendering: we have to create an array of the components from the array of data

* LifeCycle in function component:
  - In Function component, we have to use hooks in order to implement lifecycle
  - *useEffect()* -> componentDidMount, componentDidUpdate, componentWillUnmount, componentShouldUpdate

* componentDidMount:
  - *useEffect(callback, dependencyarray)*
  - *useEffect(()=>{
  }, [ ])*
  - blank array for running after 1st render

* componentDidUpdate:
  - eg. formdata, score, products
  - *useEffect(callback, dependencyarray)*
  - *useEffect(()=>{
  }, [score, products])*
  - calls when score or products object updates

* componentWillUnmount:
    - *useEffect(()=>{
      return function(){
        //cleaup here
      }
  }, [ ])*

* Note: we cannot make effect callback as async because it should return only a function, if we write asyn onto it then it will be retutning a promise and that is not possible

* To integrate Bootstrap in react app:
  - *npm i react-bootstrap*
  - In package we will get different direct components 
  - e.g  Alert component, container component, etc
  
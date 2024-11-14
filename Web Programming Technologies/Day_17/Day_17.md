* Day_17
  - 

* useNavigate()
* useParams()
* useLocation();
* LinkContainer
* OutLet


* packages to install 
  * react-router-dom
  * react-bootstrap
  * bootstrap
  * react-router-bootstrap


* Redux: 
  - State management tool
  
* e.g. BrowserRouter -> Layout -> AppRouter -> 
* e.g. Props drilling: passing data from one component to another components
   - A -> B -> C -> D
   ```jsx
   export function A(){
    const [data, setData] = useState("My State");
    return(
        <B myProp={data}/>
    )
   }
   ```
   ```jsx
   export function B(props){
    return(
        <C  myProp={props.myProp}/ >
    )
   }
   ```
   ```jsx
   export function C(props){
    return(
        <D myProp={props.myProp}/>
    )
   }
   ```
   ```jsx
   export function D(){
    return(
        <h1> This is D</h1>
    )
   }
   ```

* To pass the data from one component to other by default we have to go with Props drilling 
* But Redux is there to rescue

* How solves this problem:
  - Redux will create a store into the project 
  - it will be a centralized store
  - All the data should be contained inside of that store
  - if any component stored the data into the redux store then other components can directly ask the redux to provide the data

* Now if the certain data/state is updated in the redux store then all the components will be re-rendered

* Redux has 3 major Fundamental building Blocks/ 3 pillars:
  - Action: the Name of the operation *e.g."increase_score", "decrease_score"* acttion is an object that contains the name of the operation
  ```jsx
  { type:"INCREMENT_SCORE" }
  ```
  - Reducer: a function to manipulate the redux store data based on the action fired 
  ```jsx
    (state, action)=>{
        switch(action.type){
            "INCREMENT_SCORE": 
        }
    }
  ````
* Store: A centralized unit where redux stores the data/state
* Component -> fire action -> reducer -> manipulate redux store -> redux store

* e.g Button component -> event fired -> handler -> update the state

* to use redux:
  - *npm i redux react-redux @reduxjs/toolkit*
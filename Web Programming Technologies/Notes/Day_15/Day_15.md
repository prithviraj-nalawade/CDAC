* Day_12
   - 
   
* Form data: 
  1. create a state to collect form data
  2. As soon as user starts typing into the filed, read fields value and assign into the proper state 
  3. At the time of submit, we have to read the form data from the state

* event Handling in react:
  * if a function is gettind called on to any event, then that function will automatically get an argument that will contain the occured event object

* class component:
```jsx
operation(e){
   e.target // target will give the object of the element on which event is fired
}

<button onClick={this.operation}>click</button>
```
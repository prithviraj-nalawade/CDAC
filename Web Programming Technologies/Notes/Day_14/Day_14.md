* Day_14
  - 

* React JS
  - It is a library using which we can develop frontend of web app / SPA
  - 

1. HTML code is not reusable and hence maintenance is costly
2. Browser will load the elements everytime when user click on anchor tag
3. App will be multipage, it will reload the browser everytime 

* Advantages of using react:
  - We can write SPA(Single Page Application) easily
  - We can re-use HTML code
  - Make our web application efficient, and performant

* In Single Page application, we will have only a single html file and based on the url, it will load different-different elements

* For Single Page application, instead of creating multiple html files, we should create components

* Component: UI element visible on the screen, it can be atomic and can be consisting of many components

* For react js, we don't have to create folder stucture manually, it will
  generated with the help of a tool


* To create react-js: *create-react-app project_name*

* When we create a new react app, then always we will get an already created component i.e. App.js

* Commands:
  - npm I create-react-app -g
  - create-react-app myapp
  - go inside myapp *cd myapp*
  - npm start  

* using vite:
  - npm create vite@latest
  - choose type *React*
  - choose language *Javascript*
  - give project name *demo app*
  - go inside project folder *cd demoapp*
  - npm install 
  - npm run dev 

* React js has introduced a new extension for containg the components
  - .jsx
  - javaScript & XML
  - jsx allows a developer to write html and javascript together in on file.

* How to create a component in react:
  - there are two types of components
    1. class component: A component for which class has been created, heavy weight
    ```Js
    import {Component} from "react";
    class NavBar extends Component{

    }

    //file name MyComponent.js
    class myComponent extends Component{
      render() {
        return (
            <div>
                <h1>Hello MyComponent</h1>
                <p>This is a para in MyComponent</p>
            </div>
        );
    }
    }
    ```
    * render() is from Component parent class
    * render() is the function that will provide UI to browser
    2. function component: A component for which only function has been created
    ```Js
    function NavBar(){

    }
    ```
* Props:
  - attribute passed into a component

  - e.g <Greet personName="Prithviraj" email="prithviraj@gmail.com"></Greet> 
    - {
      personName:"Prithviraj",
      email:"prithviraj@gamil.com"
    }
    - same object is assigned as the argument of the function components
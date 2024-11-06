* Day_10
    - 
* reading a file(Asynchrounous)

```js
const fs = require('fs');
fs.readFile("my_file.txt", (error, data)=>{
    if(error){
        console.log(error);
    }else{
        console.log(data.toString());
    }
})
```
* reading a file(Synchrounous)

```Js
const fs = require('fs');
const data = fs.readFileSync("my_file.txt")
console.log(data.toString());
console.log("after reading file");
```

* creating custom modules
    - create a separate .js file
    - export properties from the same .js file in order to use them outside of the module 

* Syntax to exxport properties:
    - export.property_name = value
    - e.g. exports.fetchData = () =>{

    }
    - e.g. exports.myData = "Hello";

* utility.js

```js
exports.sum = (a, b)=>{
    return a+b;
}
```

```js
const myModule = require('./utility.js');
const sum = myModule.sum(5, 5);

console.log(sum);
```
* if module is in the same folder: require("./utility.js");
* if module is in other sub-folder in same directory: require("./folder-name/utility.js");
* if module is outside of the folder: require("../folder-name/module.name.js") ;

* Creating our own server:

* Port Number:
  - logical address given to a process runnign on server
  - avoid port numbers: 3306, 8000, 8080, 8090, 3000, 
```js
const http = require("http");

const server = http.createServer((request, response)=>{
    response.write("Hello from Server!!"); //what will be the response
    response.end(); //sends the response
});

//port number

server.listen(4050, ()=>{
    console.log("server started at port 4050......")
});

```

* Creating an ideal node application:
  - create a dedicated folder for the project
  - In the project root folder create two files
    1. index.js/app.js/server.js -> logic for starting server
    2. package.json -> metadata of the project, e.g. name of the project, author, git url, licensing, decription , installed 3rd party modules(dependencies) etc.
      - There are two ways to create package.json file:
         1. Create a file manually, and manually write its content
         2. Use a tool(npm) to create package.json file

* Node Package Manager(npm):
  1. pre-defined modules in node js
  2. user defined modules
  3. third party modules: using npmm we can install/uninstall 3rd party modules/packages

* command to create package.json in cli:
  - *npm init* 


  
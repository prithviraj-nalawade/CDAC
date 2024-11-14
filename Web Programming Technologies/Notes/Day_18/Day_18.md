* Day_18
  - 

* e.g.
  - Navbar
  - Intro
  - Carousel
  - Form
  - Footer

* Whenever there is an error into any component then the entire application crashes

* Error handling in the react component:
  - ErrorBoundary

* ErrorBoundary is a component that will handle the errors ocuuring inn the component and will provide the fallback UI
* ErrorBoundary should always be a class component
* ErrorBoundary always handles the errors occuring in child components

```jsx

export class ErrorBoundary extends Component{}

<ErrorBoundary>
    <ErrorOccuringComponent/>
</ErrorBoundary>
```
* Explore:
* List Rendering: 
  - Pagination
  - List Virtualization: react-window
  - Worker threads
  - Data Grid: Ag-grid: to create a table with features like sorting etc.

* Optimization of the performance:
  - useCallback();
  - useMemo();

* Manage API calls using redux
  - website: bezkoder
  - search: react axios app with redux
  - redux saga
  - redux rtk query

* Typescript
* Authentication: role based authentication 
* Form Handling:
  - Formik
* User InterFace: 
  - MUI
* Swagger for api documentation


* systematic manner -> database
* table format -> rows & columns
* e.g. employee -> cols(id, name, ,dept, salary, phone) *(structured data)*

* MongoDB:
  - Mongo DB doesn't stores the data into table format
  - MongoDB stores data into key & value pairs
  - database -> collections -> document -> key & values
  - e.g. [{id: 101, name:"", age: 11}, {id:102, name:" ", age:10}, {}, {}]
  - *(unstructured data)*: [{id: 1, name: " "}, {id: 2, age: 11}, ]

* Commands: 
  - *show databases*
  - *use dbname*: to create new database or use the existing database 
  - *db.createCollection(collection-name);* to create a collection
  - *db.collection-name.insert(document)* to insert a object or document
  - *db.collection-name.find()*: gives data inside the data
  - *db.collection-name.find(criteria)*: filters the data based on a criteria e.g.*db.student.find({roll:11})*, e.g *db.student.find({roll:{$gt:11}})* *$gt: greater than,  $lt: less than, $gte: greater than equal*
  - e.g.*db.student.find({$and:[{city:"Mumbai"}, {marks:{$gt:80}}]})*, e.g *db.student.find({roll:{$gt:11}})* *$gt: greater than,  $lt: less than, $gte: greater than equal, $and: and operator*
  - *db.student.delete()*: deletes all records
  - *db.student.delete(criteria)*
  - *db.student.updateOne(criteria, newData)*:
  - e.g *db.student.updateOne({roll: 11}, {$set:{name: "Prithviraj",   marks:85} })*


* Note: mongo db is a JS based dbms, for performing any operation on the database like creat a collection, CRUD operations mongo db provides an object for the same 
    - the name of the object is *db* 
    - *db* object points to currently opened database
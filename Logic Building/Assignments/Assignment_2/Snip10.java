public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 

 display(); 
 display(5); 
 } 
} 


/*error: non-static method display() cannot be referenced from a static context
 display();
 we cannot call a non-static member in static method as java doesn't allows it, also the methods
 are called without using the objects of the class.
 */
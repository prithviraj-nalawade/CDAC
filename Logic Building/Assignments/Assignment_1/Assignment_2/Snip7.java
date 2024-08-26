public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
} 

/*error: incompatible types: String cannot be converted to int
 int x = "Hello";
 
 as int is 4 byte and char is 1 byte the extra space in int is wasted so it ensures the type safetyṇ
 
 */
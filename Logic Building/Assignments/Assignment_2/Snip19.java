public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
there is no bit pattern to store the result of the integer division by zero so
it throws an exception
*/
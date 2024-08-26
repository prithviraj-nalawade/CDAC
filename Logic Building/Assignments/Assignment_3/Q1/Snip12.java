public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
} 

/*the scope of x is within the for loop so it is giving an error to access the variable 
outside the loop we should define x as a globle variable. 
*/
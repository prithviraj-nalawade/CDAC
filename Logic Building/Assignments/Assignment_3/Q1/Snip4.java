public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 1; i <= 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
} 


/*we have to change the condition to 'i < 10' as whenever the value of i is getting 10 the
condition is getting true so the loop runs one more iteration as 10 == 10 is true
*/
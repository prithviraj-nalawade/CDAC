public class IncorrectLoopUpdate {
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
}

/*the output will print the value between 0 to 5 by step 2. to print the value by step 1
we have to increment the value by 1.
*/
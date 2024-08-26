public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
}

/*the loop is not executing because of the condition. the condition to be checked is whether the
value of count is getting zero but the operator used is assignment operator '=' we should use conditional
operator '==' instead. 
*/
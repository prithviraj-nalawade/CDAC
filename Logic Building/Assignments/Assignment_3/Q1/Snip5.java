public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
}

/*the problem is with initialization also with the condition it should be
for(int i=0; i<=10 ; i++) then it will print 0 to 10
*/
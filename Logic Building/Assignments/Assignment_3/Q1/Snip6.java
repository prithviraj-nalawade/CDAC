public class MisplacedForLoopBody {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
}

/*the done is printed only once because it is not enclosed with for loop the for loop only encloses
only one statement which is written after the for. to enclose is it have to add {} to the for loop
*/
public class UninitializedWhileLoop {
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}

/* error: variable count might not have been initialized
we have to initialize the variable present in the looping condition as java doesn't assigns
a default value to them.
*/
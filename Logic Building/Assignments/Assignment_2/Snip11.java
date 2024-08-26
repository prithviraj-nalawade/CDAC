public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
}

/*Exception in thread "main" 
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
the declared array is of length 3 and we are trying to access the 5th element which doesn't
exist.
*/
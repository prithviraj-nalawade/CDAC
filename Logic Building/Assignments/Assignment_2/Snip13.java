public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 

/*Exception in thread "main" 
java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
the length of the null string cannot be determined so it throws an exception
*/
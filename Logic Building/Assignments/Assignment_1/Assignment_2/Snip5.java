public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

/*Yes we can have multiple main methods but the method which takes the String[] as an 
argument is considered as the entry point of the program execution*/
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 

/* error: constant label of type int is not compatible with switch selector type double
only constants are allowed as the parameter of the switch statement. The only the switch statement 
accepts is only integer. we can make the score variable as integer.
*/
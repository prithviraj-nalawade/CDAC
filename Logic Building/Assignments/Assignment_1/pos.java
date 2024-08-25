import java.util.*;
public class pos{
public static void main(String args[]){
   int a;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a no:");
   a = s.nextInt();
   if(a>0){
     System.out.println("The Number is Positive"); 
   }
   else{
     System.out.println("The Number is not Positive");
   }
}
}
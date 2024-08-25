import java.util.*;
public class EvenOdd{
public static void main(String args[]){
   int a;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a no:");
   a = s.nextInt();
   if(a%2==0){
     System.out.println("The Number is Even"); 
   }
   else{
     System.out.println("The Number is Odd");
   }
}
}
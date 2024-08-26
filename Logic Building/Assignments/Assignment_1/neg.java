import java.util.*;
public class neg{
public static void main(String args[]){
   int a;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a no:");
   a = s.nextInt();
   if(a<0){
     System.out.println("The Number is Negative"); 
   }
   else{
     System.out.println("The Number is not Negative");
   }
}
}
import java.util.*;
public class Largest3{
public static void main(String args[]){
   int a, b, c;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a:");
   a = s.nextInt();
   System.out.println("Enter b:");
   b = s.nextInt();
   System.out.println("Enter c:");
   c = s.nextInt();
   if(a>b){
   if(a>c){
   System.out.println("a is Largest");
   }
   else{
    System.out.println("c is Largest");
   }
   }
   else{
   if(b>c){
   System.out.println("b is Largest");
   }
   else{
    System.out.println("c is Largest");
   }
   }
  
}
}
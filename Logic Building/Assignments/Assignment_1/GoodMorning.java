import java.util.*;
public class GoodMorning{
public static void main(String args[]){
   int a;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter Time:");
   a = s.nextInt();
   if(a>5 && a<12){
     System.out.println("Good Morning!!"); 
   }
   else{
     System.out.println("Good Afternoon!!");
   }
}
}
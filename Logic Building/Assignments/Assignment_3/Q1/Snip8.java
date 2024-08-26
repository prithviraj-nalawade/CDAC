public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
}

/*it is because when the value of 1 is becoming 0 the condition becomes false so the loop
is getting executed. to print from 1 to 5 we should chage the condition to num <=5 and increment the 
value of num
*/
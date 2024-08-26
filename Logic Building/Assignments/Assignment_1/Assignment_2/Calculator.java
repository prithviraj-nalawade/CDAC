import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
	  int a, b;
	  char op;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a:");
	  a = s.nextInt();
	  System.out.println("Enter b:");
	  b = s.nextInt();
	  System.out.println("Enter a operator:");
	  op = s.next().charAt(0);
	 
	  switch(op){
		  case '+': System.out.println("Addition a+b:"+(a+b));
				  break;
		  case '-': System.out.println("Substraction a-b:"+(a-b));
				  break;
		  case '*': System.out.println("Multiplication a*b:"+(a*b));
				  break;
		  case '/':if(b == 0){
			       System.out.println("We cannot divide by '0' ");
			       } 
				   else{
				   System.out.println("Division a/b:"+(a/b));   
				   }
		           break;
		  
		  default: System.out.println("Invalid operator");
				  break;
	  }
	}
}
import java.util.Scanner;

class DayofWeek{
	public static void main(String[] args){
	  int a;
	  String day;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a day no.:");
	  a = s.nextInt();
	  if(a==6 || a==7){
		  day = "weekend";
	  }
	  else{
		  day = "weekday";
	  }
	  switch(a){
		  case 1: System.out.println("Monday "+day);
				  break;
		  case 2: System.out.println("Tuesday "+day);
				  break;
		  case 3: System.out.println("Wednesday "+day);
				  break;
		  case 4: System.out.println("Thursday "+day);
				  break;
		  case 5: System.out.println("Friday "+day);
				  break;
		  case 6: System.out.println("Saturday "+day);
				  break;
		  case 7: System.out.println("Sunday "+day);
				  break;
		  default: System.out.println("Invalid day no.");
				  break;
	  }
	}
}
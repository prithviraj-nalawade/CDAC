import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year = s.nextInt();
		int leap = 0;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leap = 1;
		}
        else{
			leap = 0;
		}		
		switch(leap){
			case 1: System.out.println(year+" is a leap year");
			        break;
			case 0: System.out.println(year+" is a not leap year");
			        break;
		}
	}
}
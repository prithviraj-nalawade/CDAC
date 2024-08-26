import java.util.Scanner;
class StudentStatus{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter grade1:");
		int grade1 = s.nextInt();
		System.out.println("Enter grade2:");
		int grade2 = s.nextInt();
		System.out.println("Enter grade3:");
		int grade3 = s.nextInt();
		int subjects = 0;
		if(grade1<40){
			grade1 = 0;
		}
		else{
			grade1 = 1;
		}
		if(grade2<40){
			grade2 = 0;
		}
		else{
			grade2 = 1;
		}
		if(grade3<40){
			grade3 = 0;
		}
		else{
			grade3 = 1;
		}
		switch(grade1){
			case 0: subjects++;
			case 1: switch(grade2){
				         case 0: subjects++;
						 case 1: switch(grade3){
							         case 0: subjects++;
									 case 1: break;
						 }
						 break;
			}
			break;
		}
		if(subjects == 0){
		System.out.println("Student Passed!!");
		}
		else{
			System.out.println("Failed in "+subjects+" subjects");
		}
	}
}
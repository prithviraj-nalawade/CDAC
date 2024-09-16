import java.util.Scanner;
class Age{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } 
		else {
            System.out.println("You are not eligible to vote.");
        }
        
	}
}
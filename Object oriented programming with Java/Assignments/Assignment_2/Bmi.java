import java.util.Scanner;

class Bmi{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Weight:");
		double weight = s.nextDouble();
		System.out.println("Enter Height(feet):");
		double height_feet = s.nextDouble();
		System.out.println("Enter Height(inch):");
		double height_inch = s.nextDouble();
		height_feet= height_feet/3.28084;
        height_inch= height_inch/39.37;
        double height_in_m = height_feet + height_inch;	
		double bmi = weight/(height_in_m*height_in_m ;
		System.out.println(height_in_m);
		if(bmi<=18.4){
		   System.out.println(bmi+" Underweight");	
		}
		else if(bmi>=18.5 && bmi<=24.9){
			System.out.println(bmi+" Normal weight");
		}
		else{
			System.out.println(bmi+" overweight");
		}
	}
}
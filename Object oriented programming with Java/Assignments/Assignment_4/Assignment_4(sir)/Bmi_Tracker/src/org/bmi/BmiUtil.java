package org.bmi;

import java.util.Scanner;

public class BmiUtil {
	
	private BmiTracker bmi = new BmiTracker();
	Scanner sc = new Scanner(System.in);
	 public void acceptRecord(){
		      
		   System.out.print("Enter Weight (in kg) 	:	");
		   this.bmi.setWeight(sc.nextDouble());
		   System.out.print("Enter Height (in meters) 	:	");
		   this.bmi.setHeight(sc.nextDouble());
		  
		   
	   }
	   
	   public double calculateBMI() {
		   this.bmi.setBMI(this.bmi.getWeight() / (this.bmi.getHeight() * this.bmi.getHeight()));
		   return this.bmi.getBMI();
		}
	   
	   public String classifyBMI() {
		   String cls = "";
		   if(this.bmi.getBMI() < 18.5) cls = "Underweight";
		   if(this.bmi.getBMI() >= 18.5 && this.bmi.getBMI() < 24.9) cls = "Normal Weight";
		   if(this.bmi.getBMI() >=25 && this.bmi.getBMI() < 29.9) cls = "Over Weight";
		   if(this.bmi.getBMI() >=30) cls = "Obese";
		   
		   return cls;
	   }
	   
	   public void printRecord() {
		   System.out.println("BMI 		:	"+this.calculateBMI());
		   System.out.println("Classification 		:	"+this.classifyBMI());
		   
	   }
	   
	   public int menuList() {
			System.out.println("0. Exit");
			System.out.println("1. AcceptRecord");
			System.out.println("2. PrintRecord");
			return sc.nextInt();
		}

}

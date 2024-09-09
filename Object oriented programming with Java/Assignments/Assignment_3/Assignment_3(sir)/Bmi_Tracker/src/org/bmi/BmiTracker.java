package org.bmi;

import java.util.Scanner;

public class BmiTracker {
   private double weight;
   private double height;
   private double BMI;
   
   
   public void acceptRecord(){
	   Scanner sc = new Scanner(System.in);   
	   System.out.print("Enter Weight (in kg) 	:	");
	   this.weight = sc.nextDouble();
	   System.out.print("Enter Height (in meters) 	:	");
	   this.height = sc.nextDouble();
	   sc.close();
	   
   }
   
   public double calculateBMI() {
	   this.BMI = this.weight / (this.height * this.height);
	   return this.BMI;
	}
   
   public String classifyBMI() {
	   String cls = "";
	   if(this.BMI < 18.5) cls = "Underweight";
	   if(this.BMI >= 18.5 && this.BMI < 24.9) cls = "Normal Weight";
	   if(this.BMI >=25 && this.BMI < 29.9) cls = "Over Weight";
	   if(this.BMI >=30) cls = "Obese";
	   
	   return cls;
   }
   
   public void printRecord() {
	   System.out.println("BMI 		:	"+this.calculateBMI());
	   System.out.println("Classification 		:	"+this.classifyBMI());
	   
   }
   
}

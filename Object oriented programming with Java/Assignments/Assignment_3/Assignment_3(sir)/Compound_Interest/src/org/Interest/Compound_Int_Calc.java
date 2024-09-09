package org.Interest;

import java.util.Scanner;

public class Compound_Int_Calc {
	
	private double principal;
	private double annualInterestRate;
	private double numberOfCompound;
	private double years;
	private double futureValue;
	private double totalInterest;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount 		: 	");
		this.principal = sc.nextDouble();
		System.out.print("Enter Annual Interest Rate	: 	");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("Enter number of Compound		: 	");
		this.numberOfCompound = sc.nextDouble();
		System.out.print("Enter number of Years 		: 	");
		this.years = sc.nextDouble();
		sc.close();
		
	}
	
	public void calculateFutureValue() {
		this.futureValue = this.principal * Math.pow(1+this.annualInterestRate/this.numberOfCompound, this.numberOfCompound*this.years);
		this.totalInterest = this.futureValue - this.principal;
	}
	
	public void printRecord() {
		System.out.printf("Future Value				: 	%.2f",this.futureValue);
		System.out.println();
		System.out.printf("Total Interest Earned	: 	%.2f",this.totalInterest);
		
	}

}

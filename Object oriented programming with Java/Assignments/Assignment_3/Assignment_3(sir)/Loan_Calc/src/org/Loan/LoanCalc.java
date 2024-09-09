package org.Loan;

import java.util.Scanner;

class LoanCalc {
	
	private double principal;
	private double annualInterestRate;
	private double loanTerm;
	private double monthlyInterest;
	private double monthlyPayment;
	private double numberOfMonths;
	private double total;
	
	public void acceptRecords() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount	 	:	");
		this.principal = sc.nextDouble();
		System.out.print("Enter Annual Interest Rate	 	:	");
		this.annualInterestRate = sc.nextDouble();
		System.out.print("Enter Loan Term	 	:	");
		this.loanTerm = sc.nextDouble();
		sc.close();
		
		
	}
	
	public void calculateMonthlyPayment() {
		this.monthlyInterest = this.annualInterestRate / 12 / 100; 
		this.numberOfMonths = this.loanTerm * 12;
		this.monthlyPayment = this.principal * 
				(this.monthlyInterest * Math.pow((1+this.monthlyInterest), this.numberOfMonths)) 
				/ (Math.pow((1+this.monthlyInterest), this.numberOfMonths) - 1);
		this.total = this.monthlyPayment * this.numberOfMonths;
		
	}
	
	public void printRecord() {
		System.out.printf("Monthly payment 	:	%.2f",this.monthlyPayment);
		System.out.println();
		System.out.printf("Total payment 	:	%.2f",this.total);
	}
 
	
}



package org.Loan;

import java.util.Scanner;

public class LoanCalcUtil {
	
	private LoanCalc lc = new LoanCalc();
	private Scanner sc = new Scanner(System.in);
	
	
	public void acceptRecords() {
		
		System.out.print("Enter principal amount	 	:	");
		this.lc.setPrincipal(sc.nextDouble());
		System.out.print("Enter Annual Interest Rate	 	:	");
		this.lc.setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter Loan Term	 	:	");
		this.lc.setLoanTerm(sc.nextDouble());
		
		
		
	}
	
	public void calculateMonthlyPayment() {
		this.lc.setMonthlyInterest(this.lc.getAnnualInterestRate() / 12 / 100); 
		this.lc.setNumberOfMonths(this.lc.getLoanTerm() * 12);
		this.lc.setMonthlyPayment(this.lc.getPrincipal() * 
				(this.lc.getMonthlyInterest() * Math.pow((1+this.lc.getMonthlyInterest()), this.lc.getNumberOfMonths())) 
				/ (Math.pow((1+this.lc.getMonthlyInterest()), this.lc.getNumberOfMonths()) - 1));
		this.lc.setTotal(this.lc.getMonthlyPayment() * this.lc.getNumberOfMonths());
		
		
		
	}
	
	public void printRecord() {
		calculateMonthlyPayment();
		System.out.printf("Monthly payment 	:	%.2f\n",this.lc.getMonthlyPayment());
		System.out.printf("Total payment 	:	%.2f\n",this.lc.getLoanTerm());
		
		}
 
	
	public int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. AcceptRecord");
		System.out.println("2. PrintRecord");
		return sc.nextInt();
	}

	

}

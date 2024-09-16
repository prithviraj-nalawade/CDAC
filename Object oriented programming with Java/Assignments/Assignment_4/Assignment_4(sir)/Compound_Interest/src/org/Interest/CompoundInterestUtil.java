package org.Interest;

import java.util.Scanner;

public class CompoundInterestUtil {
	Compound_Int_Calc cal = new Compound_Int_Calc();
	private Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.print("Enter principal amount 		: 	");
		this.cal.setPrincipal(sc.nextDouble());
		System.out.print("Enter Annual Interest Rate	: 	");
		this.cal.setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter number of Compound		: 	");
		this.cal.setNumberOfCompound(sc.nextDouble());
		System.out.print("Enter number of Years 		: 	");
		this.cal.setYears(sc.nextDouble());
		
		
	}
	
	public void calculateFutureValue() {
		this.cal.setFutureValue(this.cal.getPrincipal() * Math.pow(1+this.cal.getAnnualInterestRate()/this.cal.getNumberOfCompound(), this.cal.getNumberOfCompound()*this.cal.getYears()));
		this.cal.setTotalInterest(this.cal.getFutureValue() - this.cal.getPrincipal());
	}
	
	public void printRecord() {
		calculateFutureValue();
		System.out.printf("Future Value				: 	%.2f",this.cal.getFutureValue());
		System.out.println();
		System.out.printf("Total Interest Earned	: 	%.2f\n",this.cal.getTotalInterest());
		
	}
	public int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. AcceptRecord");
		System.out.println("2. PrintRecord");
		return sc.nextInt();
	}


}

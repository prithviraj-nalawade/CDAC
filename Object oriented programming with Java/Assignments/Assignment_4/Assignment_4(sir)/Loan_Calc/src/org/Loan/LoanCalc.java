package org.Loan;



public class LoanCalc {
	
	private double principal;
	private double annualInterestRate;
	private double loanTerm;
	private double monthlyInterest;
	private double monthlyPayment;
	private double numberOfMonths;
	private double total;
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(double loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getMonthlyInterest() {
		return monthlyInterest;
	}
	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public double getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		return "LoanCalc [principal=" + principal + ", annualInterestRate=" + annualInterestRate + ", loanTerm="
				+ loanTerm + ", monthlyInterest=" + monthlyInterest + ", monthlyPayment=" + monthlyPayment
				+ ", numberOfMonths=" + numberOfMonths + ", total=" + total + "]";
	}
	
	
	
	
	
}



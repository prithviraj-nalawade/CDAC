package org.Interest;



public class Compound_Int_Calc {
	
	private double principal;
	private double annualInterestRate;
	private double numberOfCompound;
	private double years;
	private double futureValue;
	private double totalInterest;
	
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
	public double getNumberOfCompound() {
		return numberOfCompound;
	}
	public void setNumberOfCompound(double numberOfCompound) {
		this.numberOfCompound = numberOfCompound;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public String toString() {
		return "Compound_Int_Calc [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberOfCompound=" + numberOfCompound + ", years=" + years + ", futureValue=" + futureValue
				+ ", totalInterest=" + totalInterest + "]";
	}
	

}

package org.Loan;

public class Main {
  public static void main(String[] args) {
	LoanCalc loan = new LoanCalc();
	loan.acceptRecords();
	loan.calculateMonthlyPayment();
	loan.printRecord();
}
}
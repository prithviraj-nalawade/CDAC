package org.Loan;

public class Main {
  public static void main(String[] args) {
	LoanCalcUtil lc = new LoanCalcUtil();
	int choice;
	while((choice = lc.menuList()) != 0) {
		switch(choice) {
		case 1:lc.acceptRecords();
			break;
		case 2:lc.printRecord();
			break;
		}
	}
}
}
package org.Interest;


public class Main {
  public static void main(String[] args) {
	CompoundInterestUtil cal = new CompoundInterestUtil();
	int choice;
	while((choice = cal.menuList()) != 0) {
		switch(choice) {
		case 1:cal.acceptRecord();
			break;
		case 2:cal.printRecord();
			break;
		}
	}
}
}
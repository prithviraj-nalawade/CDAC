package org.discount;


public class Main {
  public static void main(String[] args) {
	DiscountUtil bmi = new DiscountUtil();
	int choice;
	while((choice = bmi.menuList()) != 0) {
		switch(choice) {
		case 1:bmi.acceptRecord();
			break;
		case 2:bmi.printRecord();
			break;
		}
	}
}
}
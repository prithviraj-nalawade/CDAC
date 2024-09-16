package org.bank;
import java.util.Scanner;

class SavingsAccount extends BankAccount{
	
	@Override
	public void withdraw(Scanner sc) {
		System.out.println("Enter amount to withdraw: ");
		setWithdrawMoney(sc.nextInt());
		if (getwithdrawMoney() <=1000) {
		super.withdraw(sc);
		System.out.println("Total balance: "+this.getTotalBalance());
	}
		else {
			System.out.println("Withdrawal Limit is 1000");
		}
	}
}
package org.bank;

import java.util.Scanner;

/*Create a base class BankAccount with methods like deposit() and withdraw(). 
 * Derive a class SavingsAccount that overrides the withdraw() method to impose a 
 * limit on the withdrawal amount. Write a program that demonstrates the use 
 * of overridden methods and proper access modifiers & return the details.*/
public class BankAccount {
	private int totalBalance;
	private int depositMoney;
	private int withdrawMoney;
	
	public int getTotalBalance() {
		return totalBalance;
	}
	
	public int getwithdrawMoney() {
		return this.withdrawMoney;
	}
	
	public void setWithdrawMoney(int withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}
	
	
	public BankAccount() {
		this.totalBalance = 0;
		this.depositMoney = 0;
		this.withdrawMoney = 0;
	}
	
	public void deposit(Scanner sc) {
		System.out.println("Enter amount to deposit: ");
		this.depositMoney = sc.nextInt();
	    this.totalBalance += this.depositMoney;	
	}
	
	public void withdraw(Scanner sc) {
		this.totalBalance -= this.withdrawMoney;
	}
	
	
}






package org.bank;

/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). 
 * Derive a class SavingsAccount that overrides the withdraw() method to impose a 
 * limit on the withdrawal amount. 
 * Write a program that demonstrates the use of overridden methods and proper access 
 * modifiers & return the details.*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount s = new SavingsAccount();
		s.withdraw(sc);
	}
}

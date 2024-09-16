package org.discount;

import java.util.Scanner;

public class DiscountCalculator {
	
	private int originalPrice;
	private double discountRate;
    private double discountAmount;
    private double finalRate;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the original Price 	:	");
		this.originalPrice = sc.nextInt();
		System.out.print("Enter the discount rate 	:	");
		this.discountRate = sc.nextDouble();
		sc.close();
	}
	
	public double calculateDiscount() {
		this.discountAmount = this.originalPrice * (this.discountRate/100);
		this.finalRate = this.originalPrice - this.discountAmount;
		return discountAmount;
	}
	
	public void printRecord() {
		System.out.println(String.format("Discount Amount 	:	%.2f", this.calculateDiscount()));
		System.out.println(String.format("Final Amount 	:	%.2f", this.finalRate));
	}

}

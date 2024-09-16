package org.discount;

import java.util.Scanner;

public class DiscountUtil {
	
	private DiscountCalculator d = new DiscountCalculator();
	private Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.print("Enter the original Price 	:	");
		this.d.setOriginalPrice(sc.nextInt());
		System.out.print("Enter the discount rate 	:	");
		this.d.setDiscountRate(sc.nextDouble());
		;
	}
	
	public double calculateDiscount() {
		this.d.setDiscountAmount(this.d.getOriginalPrice() * (this.d.getDiscountRate() /100));
		this.d.setFinalRate(this.d.getOriginalPrice()-this.d.getDiscountAmount());
		return this.d.getDiscountAmount();
	}
	
	public void printRecord() {
		System.out.println(String.format("Discount Amount 	:	%.2f", this.calculateDiscount()));
		System.out.println(String.format("Final Amount 	:	%.2f", this.d.getFinalRate()));
	}
	
	public int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. AcceptRecord");
		System.out.println("2. PrintRecord");
		return sc.nextInt();
	}

}

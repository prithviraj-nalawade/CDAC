package org.discount;

import java.util.Scanner;

public class DiscountCalculator {
	
	private int originalPrice;
	private double discountRate;
    private double discountAmount;
    private double finalRate;
	public int getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getFinalRate() {
		return finalRate;
	}
	public void setFinalRate(double finalRate) {
		this.finalRate = finalRate;
	}
	
	public String toString() {
		return "DiscountCalculator [originalPrice=" + originalPrice + ", discountRate=" + discountRate
				+ ", discountAmount=" + discountAmount + ", finalRate=" + finalRate + "]";
	}
	
	

}

package org.Toll;

import java.util.Scanner;

public class TollBoothRevenueManager {
    private int carCount;
    private int truckCount;
    private int motorCycleCount;
    private double carRate;
    private double truckRate;
    private double motorCycleRate;
    private double totalRevenue;
    
    public void setRate(Scanner sc) {
    
    	System.out.print("Enter Car Toll Rate   :	");
    	this.carRate = sc.nextDouble();
    	System.out.print("Enter Truck Toll Rate   :	");
    	this.truckRate = sc.nextDouble();
    	System.out.print("Enter Motor Cycle Toll Rate   :	");
    	this.motorCycleRate = sc.nextDouble();
    	
    }
    
    public void acceptRecord(Scanner sc) {
    	
    	System.out.print("Enter Car Count   :	");
    	this.carCount = sc.nextInt();
    	System.out.print("Enter Truck Count   :	");
    	this.truckCount = sc.nextInt();
    	System.out.print("Enter MotorCycle Count   :	");
    	this.motorCycleCount = sc.nextInt();
    	
    }
    
    public double calculateRevenue() {
    	this.totalRevenue = (this.carCount*this.carRate)+(this.truckCount*this.truckRate)+(this.motorCycleCount*this.motorCycleRate);
    	return this.totalRevenue;
    }
    
    public void printRecord() {
    	System.out.println("Total Revenue Earned   :    "+this.calculateRevenue());
    }
}

package org.Toll;

import java.util.Scanner;

public class TollUtil {
	
	private TollBoothRevenueManager toll = new TollBoothRevenueManager();
	
	  public void acceptRecord(Scanner sc) {
	    	System.out.print("Enter Car Toll Rate   :	");
	    	this.toll.setCarRate(sc.nextDouble());
	    	System.out.print("Enter Truck Toll Rate   :	");
	    	this.toll.setTruckRate(sc.nextDouble());
	    	System.out.print("Enter Motor Cycle Toll Rate   :	");
	    	this.toll.setMotorCycleRate(sc.nextDouble());
	    	System.out.print("Enter Car Count   :	");
	    	this.toll.setCarCount(sc.nextInt());
	    	System.out.print("Enter Truck Count   :	");
	    	this.toll.setTruckCount(sc.nextInt());
	    	System.out.print("Enter MotorCycle Count   :	");
	    	this.toll.setMotorCycleCount(sc.nextInt());
	    	
	    }
	    
	    public double calculateRevenue() {
	    	this.toll.setTotalRevenue((this.toll.getCarCount()*this.toll.getCarRate())+(this.toll.getTruckCount()*this.toll.getTruckRate())+(this.toll.getMotorCycleCount()*this.toll.getMotorCycleRate()));
	    	return this.toll.getTotalRevenue();
	    }
	    
	    public void printRecord() {
	    	System.out.println("Total Revenue Earned   :    "+this.calculateRevenue());
	    }

	    public int menuList(Scanner sc) {
			System.out.println("0. Exit");
			System.out.println("1. AcceptRecord");
			System.out.println("2. PrintRecord");
			return sc.nextInt();
		}

}

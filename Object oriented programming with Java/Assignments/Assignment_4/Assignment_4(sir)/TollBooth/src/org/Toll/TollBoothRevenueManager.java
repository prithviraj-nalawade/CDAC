package org.Toll;



public class TollBoothRevenueManager {
    private int carCount;
    private int truckCount;
    private int motorCycleCount;
    private double carRate;
    private double truckRate;
    private double motorCycleRate;
    private double totalRevenue;
	public int getCarCount() {
		return carCount;
	}
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	public int getTruckCount() {
		return truckCount;
	}
	public void setTruckCount(int truckCount) {
		this.truckCount = truckCount;
	}
	public int getMotorCycleCount() {
		return motorCycleCount;
	}
	public void setMotorCycleCount(int motorCycleCount) {
		this.motorCycleCount = motorCycleCount;
	}
	public double getCarRate() {
		return carRate;
	}
	public void setCarRate(double carRate) {
		this.carRate = carRate;
	}
	public double getTruckRate() {
		return truckRate;
	}
	public void setTruckRate(double truckRate) {
		this.truckRate = truckRate;
	}
	public double getMotorCycleRate() {
		return motorCycleRate;
	}
	public void setMotorCycleRate(double motorCycleRate) {
		this.motorCycleRate = motorCycleRate;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	
	public String toString() {
		return "TollBoothRevenueManager [carCount=" + carCount + ", truckCount=" + truckCount + ", motorCycleCount="
				+ motorCycleCount + ", carRate=" + carRate + ", truckRate=" + truckRate + ", motorCycleRate="
				+ motorCycleRate + ", totalRevenue=" + totalRevenue + "]";
	}
    
    
   
    
  }

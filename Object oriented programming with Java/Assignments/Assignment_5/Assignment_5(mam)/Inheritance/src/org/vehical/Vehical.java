package org.vehical;

public class Vehical {
    private String make;
    private int year;
    
    public Vehical() {
    	this("", 0);
    }
    
    public Vehical(String make, int year) {
    	this.make = make;
    	this.year = year;
    }
    
    public void setMake(String make) {
    	this.make = make;
    }
     public void setYear(int year) {
		this.year = year;
	}
    public String getMake() {
    	return this.make;
    }
    
    public int getYear() {
		return year;
	}
}

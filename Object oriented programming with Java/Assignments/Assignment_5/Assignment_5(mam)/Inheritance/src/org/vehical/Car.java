package org.vehical;

public class Car extends Vehical {
     private String model;
     
     public Car() {
    	 this.model = "";
     }
     
     public Car(String make, int year, String model) {
    	 super(make, year);
    	 this.model = model;
    	 
     }
     
     public void displayRecord() {
		System.out.println("Make:  "+this.getMake());
		System.out.println("Year:  "+this.getYear());
		System.out.println("Model:  "+this.model);
		

	}
}

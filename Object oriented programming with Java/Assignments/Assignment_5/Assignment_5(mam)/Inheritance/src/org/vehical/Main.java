package org.vehical;
/*2)	Create a base class Vehicle with attributes like make and year. 
 * Provide a constructor in Vehicle to initialize these attributes. 
 * Derive a class Car that has an additional attribute model and write a constructor 
 * that initializes make, year, and model. 
 * Write a program to create a Car object and display its details.*/
public class Main {
     public static void main(String[] args) {
		Car c = new Car("Tata", 1980, "X2");
		c.displayRecord();
	}
}

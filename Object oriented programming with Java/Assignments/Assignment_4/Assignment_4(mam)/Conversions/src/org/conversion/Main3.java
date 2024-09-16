package org.conversion;
/*3) Write a program that performs arithmetic operations involving different data types 
 * (int, double, float) and observes how Java handles widening conversions automatically.*/
public class Main3 {

	public static void main(String[] args) {
		int i = 10;
		double d = 20.20;
		float f = 30.30f;
		
		System.out.println("Addition int + double :"+(i+d));
		System.out.println("Substraction int + double :"+(i-d));
		System.out.println("Multiplication int + double :"+(i*d));
		System.out.println("Division int + double :"+(i/d));
		
		System.out.println("Addition int + float :"+(i+f));
		System.out.println("Substraction int + float :"+(i-f));
		System.out.println("Multiplication int + float :"+(i*f));
		System.out.println("Division int + float :"+(i/f));
		
		System.out.println("Addition float + double :"+(f+d));
		System.out.println("Substraction float + double :"+(f-d));
		System.out.println("Multiplication float + double :"+(f*d));
		System.out.println("Division float + double :"+(f/d));

	}

}

package org.Engine;

public class Main {

	public static void main(String[] args) {
		MotorCycle m = new MotorCycle();
		Car c = new Car();
		
		m.startEngine();
		m.stopEngine();
		
		
		c.startEngine();
		c.stopEngine();

	}

}

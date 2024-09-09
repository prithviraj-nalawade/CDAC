package org.bmi;

public class Main {
       public static void main(String[] args) {
		BmiTracker bmi = new BmiTracker();
		bmi.acceptRecord();
		bmi.printRecord();
	}
}

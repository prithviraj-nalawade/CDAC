package org.log;

public class Main {

	public static void main(String[] args) {
		Logger log = new Logger();
		log.log("First");
		log.log("Second");
		System.out.println("Current log: "+log.getLog());
		log.clearLog();
		System.out.println("After Clearing: "+log.getLog());
		

	}

}

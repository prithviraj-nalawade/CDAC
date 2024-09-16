package org.Engine;

public class Vehical {
	
	private String type;
	
	public Vehical() {
		this(null);
	}
	
	public Vehical(String type) {
		this.type = type;
	}
	
	public void startEngine() {
		System.out.println(this.type+" Engine has Started");
     }
	
	public void stopEngine() {
		System.out.println(this.type+" Engine has Stopped");
     }
	

}

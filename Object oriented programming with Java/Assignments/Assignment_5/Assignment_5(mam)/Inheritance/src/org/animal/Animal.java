package org.animal;

public class Animal {
    private String name;
    
    public Animal() {
    	this("");
    }
    public Animal(String name) {
    	this.name = name;
    }
    public void eat() {
    	System.out.println(this.name+" can eat");
    }
    
    public void sleep() {
    	System.out.println(this.name+" can sleep");
    }
    
    
}


package org.animal;

/*3)	Create a base class Animal with attributes like name, and methods like eat() and sleep().
 *  Create a subclass Dog that inherits from Animal and has an additional method bark(). 
 *  Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and 
 *  calling their methods.

*/

public class Main {

	public static void main(String[] args) {
	
		Dog d = new Dog();
		Animal a = d;    //upcasting
		Dog d1 = (Dog)a;  //downcasting requires typecasting; 
		
		
		System.out.println();
		
		
		a.eat();
		a.sleep();
		d1.bark();
		
         
	}

}

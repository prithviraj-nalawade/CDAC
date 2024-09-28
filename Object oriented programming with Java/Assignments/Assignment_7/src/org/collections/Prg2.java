package org.collections;

import java.util.ArrayList;
import java.util.Collections;

//2)Create a Person class with attributes name and age. Write a Java program that sorts 
//a list of Person objects first by age and then by name if the ages are equal.
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(){
		this("", 0);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name:"+name+" Age:"+age;
	}
	
	public int compareTo(Person p) {
		if(this.age != p.age)
			return this.age - p.age;
		
		return this.name.compareTo(p.name);
	}
}
public class Prg2{
	public static void main(String[] args) {
		Person p0 = new Person("Aniket", 22);
		Person p1 = new Person("Prithviraj", 23);
		Person p2 = new Person("Ritesh", 23);
		Person p3 = new Person("Paresh", 23);
		Person p4 = new Person("Harshal", 23);
		
		Person[] pArr = {p0, p1, p2, p3, p4};
		
		ArrayList<Person> arrP = new ArrayList<Person>();
		for(int i=0; i<5; i++)
			arrP.add(pArr[i]);
		
		Collections.sort(arrP);
		System.out.println("Sorted List:");
		for(Person p : arrP)
			System.out.println(p);
	}
}
//1)Write a Java program that takes a list of integers as input and 
//returns a list of duplicate integers.

package org.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Prg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> arr = new ArrayList<>();
		
		
		for(int i=0; i<10; i++) {
			System.out.print("Enter element at arr["+i+"]:");
			arr.add(sc.nextInt());
		
		}
		
		HashSet<Object> dup = new HashSet<>(arr);
		
		for(Object i : dup)
			System.out.println(i);
		
	
	}
	
	

}

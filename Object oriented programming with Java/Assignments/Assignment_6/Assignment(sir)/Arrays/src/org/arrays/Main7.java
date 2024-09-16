package org.arrays;

import java.util.Scanner;

class Array{
	private int arr[];
	
	public Array() {
		 this.arr = new int[] {0, 1, 3};
		
}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size  :  ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"]  :  ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
	}
	public void printRecord() {
		for(int i : arr) {
			System.out.println(i);
		}

	}
}

public class Main7 {

	public static void main(String[] args) {
		   Array arr = new Array();
		   arr.acceptRecord();
	       arr.printRecord();

	}

}

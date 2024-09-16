package org.arrays;

import java.util.Scanner;

class Array1{
	private int arr[];
	
	

	public void setArr(int[] arr) {
		this.arr = arr;
	}



	public int[] getArr() {
		return this.arr;
	}
}

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size  : " );
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for(int i=0; i<arr1.length; i++) {
			System.out.print("a["+i+"]= ");
		    arr1[i] = sc.nextInt();
		}
		
		Array1 arr = new Array1();
		arr.setArr(arr1);
		int[] arr2 = arr.getArr();
		
		for(int i : arr2)
			System.out.println(i);
		sc.close();	
		   

	}

}

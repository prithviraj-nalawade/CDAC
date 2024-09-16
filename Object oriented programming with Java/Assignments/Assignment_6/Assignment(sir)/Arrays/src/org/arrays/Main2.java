package org.arrays;

import java.util.Scanner;

public class Main2 {
	
  private Scanner sc = new Scanner(System.in);
  public void acceptRecord(int[] arr) {
	  for(int index=0; index<5; ++ index) {
		  System.out.print("arr["+index+"]:	");
			arr[index] = sc.nextInt();
	  
  }
	 sc.close();
	 
  }
  public void printRecord(int[] arr) {
	  for(int index=0; index<5; ++ index)
			System.out.println(arr[index]);
  }

   public static void main(String[] args) {
	int arr[] = new int[5];
	
	System.out.println("Default:");
	for(int index=0; index<5; ++ index)
		System.out.println(arr[index]);
	Main2 m = new Main2();
	
	m.acceptRecord(arr);
	m.printRecord(arr);
	
	
	
}
}

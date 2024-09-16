package org.arrays;

import java.util.Scanner;

public class Main1 {
	
  private Scanner sc = new Scanner(System.in);
  public void acceptRecord(int[] arr) {
	  for(int index=0; index<5; ++ index) {
		  System.out.print("arr["+index+"]:	");
			arr[index] = sc.nextInt();
	  
  }
	  sc.close();
  }
  

   public static void main(String[] args) {
	int arr[] = new int[5];
	
	System.out.println("Default:");
	for(int index=0; index<5; ++ index)
		System.out.println(arr[index]);
	Main1 m = new Main1();
	
	m.acceptRecord(arr);
	
	for(int index=0; index<5; ++ index)
		System.out.println(arr[index]);
	
}
}

package org.arrays;


public class Main3 {
  public static void main(String[] args) {
	int[] arr = {1, 9, 8, 0, 6};
	int max=0, min=arr[0];
	for(int index = 0; index<arr.length; ++index) {
		if(max < arr[index]) {
			max = arr[index];
		}
		
		if(min > arr[index]) {
			min = arr[index];
		}
	}
	
	System.out.println("Maximum: "+max);
	System.out.println("Minimum: "+min);
}
}

package org.arrays;

public class Main5 {
public static void main(String[] args) {
	int arr1[] = {1, 2, 3, 4, 5};
	int arr2[]= {1, 3, 3, 6};
	
	
	for(int i=0; i<arr1.length; i++) {
	for(int j=0; j<arr2.length; j++) {
	if(arr1[i] == arr2[j])	{
		System.out.print(arr1[i] +" ");
		
		break;
	}
	}
	}
}
}

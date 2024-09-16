package org.arrays;

public class Main4 {

	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 8, 1, 6, 8, 6};
		int[] arr1 = new int[arr.length]; 
		int uindex = 0;
		
		for(int index = 0; index<arr.length; ++index) {
			boolean dup = false;
			for (int j = 0; j < uindex; j++) {
                if (arr[index] == arr1[j]) {
                    dup = true;
                    break;
                }
            }
			if (!dup) {
                arr1[uindex] = arr[index];
                uindex++;
            }
			
			
		}
		
		for(int index = 0; index<uindex; ++index) {
		  System.out.println("arr1["+index+"]:  "+arr1[index]);
		}

	}

}

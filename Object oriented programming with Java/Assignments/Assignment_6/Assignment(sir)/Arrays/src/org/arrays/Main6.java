package org.arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};  
        int N = 5;  

        int eSum = 0;
        int aSum = 0;

        for (int i = 1; i <= N; i++) {
            eSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            aSum += arr[i];
        }

        int missingNumber = eSum - aSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}

public class Armstrong{
	public static void main(String[] args){
		int n = 153, count=0;
		int dup = n;
		int result = 0;
		while(dup > 0){
		  dup = dup / 10;
		  count++;
		  
	}
	dup=n;
	
	while(dup>0){
		int a = dup % 10;
	    dup = dup / 10;
		int power = (int)Math.pow(a, count);
		result = result + power;
		
	}
	System.out.println(result==n);
	
	}
}

/*Explaination:-
 Armstrong:
 153 = 1^3+5^3+3^3
 153 = 1+125+27
 
 
 Step 1: First we will copy the original given value to a dup variable.
 Step 2: To get the count of number of integers in the dup variable we run a while loop
         until dup is greater than '0' we increment the value of count variable by '1'
		 we divide the value of dup variable to get rid of the last digit in dup variable.
 Step 3: Again we assign the original value of n to dup variable.
 Step 4: We run a while loop until dup variable's value is greater than '0'. we take the 
         modulas of dup by '10' to get the last digit of the dup variable and store it in a variable.
		 then we use Math.pow to get the power of the a and store it in the power variable.
		 the we add the power to the result variable.
 Step 5: we check if result is equal to the n variable then return true else false.
*/
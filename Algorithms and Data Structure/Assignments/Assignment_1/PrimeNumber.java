public class PrimeNumber{
	public static void main(String[] args){
		int n = 3;
		int count = 0;
		for(int i=1; i<=n; ++i){
			if(n%i == 0){
				
				count++;
			}
			
		}
		if(count == 2)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
}


/*Explainaton 
Step 1: we declare an int n to stored the number for hich we are checking its prime or not,
        we initialized a counter
step 2: we run an for loop to from 1 to n to check if the number produces the the remainder
        as '0' when taking the mod of the number.
Step 3: if it does the we increase the counter.
Step 4: we check if the value of the count is '2' as a prime number is only divisible by and itself 
        so the counter we get increased by '2'. if its '2' then it will print true or else false.


*/
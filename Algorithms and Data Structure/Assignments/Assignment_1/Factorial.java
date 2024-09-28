public class Factorial{
	public static void main(String[] args){
	int n = 5, f=1;
	for(int i=n; i>=1; --i){
		f = f * i;
	} 
	
	System.out.println(f);
}
}

/*Explanation:
We have intialized a variable n with a value for which we are calculating the factorial. 
A variable f to store the value of factorial. we have written a for loop from n to 1. so that
we can multiply f in reverse order as:

5! = 5*4*3*2*1.


*/
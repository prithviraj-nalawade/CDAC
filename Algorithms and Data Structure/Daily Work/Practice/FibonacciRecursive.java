public class FibonacciRecursive{
	static int fib(int n){
		if(n<=0)
			return n;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args){
		int num = 5;
		for(int i=0; i<=num; i++){
			System.out.print(fib(i)+" ");	 
		}
	}
}
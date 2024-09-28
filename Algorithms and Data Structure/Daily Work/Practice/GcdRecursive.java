public class GcdRecursive{
	static int gcd(int a, int b){
		if(a>b)
		 return gcd(a%b, b);
	    else
			return gcd(a, b%a);
		
	}
	
	public static void main(String[] args){
		System.out.print(gcd(4, 6));
	}
}
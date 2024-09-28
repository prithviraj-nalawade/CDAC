public class GcdRecursiveStr{
	static String gcd(int n){
		if(n==1)
			return "int";
		return "gcd(int,"+gcd(n-1)+")";
	}
	
	public static void main(String[] args){
		System.out.print(gcd(3));
	}
}
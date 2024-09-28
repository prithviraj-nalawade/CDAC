public class Gcd{
	public static void main(String[] args){
		int a = 54, b = 24;
		int n=0, gcd=0;
		if(a>b)
			n = a;
		for(int i=1; i<=n; ++i){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		System.out.print(gcd);
	}
}
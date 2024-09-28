public class Fibonacci{
	public static void main(String[] args){
		int f=0, s=1, t=0;
		int n=8;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=f; i<n-2;++i){
			t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
			
		}
	}
}

/*


*/
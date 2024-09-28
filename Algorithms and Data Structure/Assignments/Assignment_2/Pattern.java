public class Pattern{
    static void print(int n){
		if(n == 0){
			return;
		}
		System.out.print("*");
		print(n-1);
	}
	static void pat(int n, int i){
		if(n==0)
		   return;
	    print(i);
		System.out.println("");
	    pat(n-1, i+1);
	} 
	public static void main(String[] args){
		pat(3, 1);
	}
}
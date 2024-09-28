public class HanoiRecursive{
	static void hanoi(int n, char s, char a, char d){
		if(n==1){
			System.out.println("disk "+s+"to"+d);
		}
		else{
		hanoi(n-1, s, d, a);
		System.out.println("disk "+s+"to"+d);
		hanoi(n-1, a, s, d);
		}
	} 
	
	public static void main(String[] args){
		hanoi(3, 'A','B', 'C' );
	}
}
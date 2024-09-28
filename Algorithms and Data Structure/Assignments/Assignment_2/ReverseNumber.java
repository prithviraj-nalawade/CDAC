public class ReverseNumber{
	static int rev(int n, int temp){
		if(n==0)
			return temp;
		temp = (temp*10)+(n%10);
		return rev(n/10, temp);
	}
	public static void main(String[] args){
		int n = -9876;
		System.out.println(rev(n, 0));
		
	}
}
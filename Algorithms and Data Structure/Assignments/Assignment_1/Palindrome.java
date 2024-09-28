public class Palindrome{
	public static void main(String args[]){
		int n = -121, temp = n;
		int a=0;
		while(temp > 0){
			a = (a*10)+(temp%10);
			temp = temp /10;
	}
	System.out.println(a == n);
}
}
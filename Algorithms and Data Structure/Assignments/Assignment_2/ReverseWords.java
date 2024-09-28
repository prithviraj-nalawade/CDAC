public class ReverseWords{
	public static void main(String[] args){
		String str = "Hello World";
		String[] s = str.split(" ");
		for(int i=s.length-1; i>=0; --i)
			System.out.print(s[i]+" ");
	}
}
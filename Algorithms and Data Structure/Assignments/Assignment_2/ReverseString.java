public class ReverseString{
	static String rev(String str){
		if(str.length()==0)
			return str;
		return rev(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String args[]){
		System.out.println(rev("Hello"));
	}
}
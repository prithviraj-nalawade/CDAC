public class PalindromeString{
	static String rev(String str){
		if(str.length() == 0)
			return str;
		return rev(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args){
	    String str = "madam";
	    System.out.println(str.equals(rev(str))); 
	}
}
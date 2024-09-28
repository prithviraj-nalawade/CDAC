public class RemoveSpace{
	public static void main(String[] args){
		String str = "Hello World";
		StringBuilder r = new StringBuilder();
		for(int i=0; i<str.length(); ++i){
			if(str.charAt(i) != ' ')
				r.append(str.charAt(i));
			
		}
		System.out.println(r);
		
	}
}
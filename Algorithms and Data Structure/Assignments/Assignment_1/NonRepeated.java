public class NonRepeated{
	public static void main(String[] args){
		String str = "aabbcc";
		String dup="";
		
		
		for(int i=0; i<str.length(); ++i){
			boolean f = true;
			for(int j=0; j<str.length(); ++j){
				if(i!=j && str.charAt(i) == str.charAt(j)){
					f = false;
					break; 
				}   
			}
			if(f){
			 dup +=str.charAt(i);
			}
		}
		System.out.println(dup==""?null:dup.charAt(0));
	}
}
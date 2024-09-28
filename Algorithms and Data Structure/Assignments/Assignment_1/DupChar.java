public class DupChar{
	
	
	public static void main(String[] args){
		String str = "programming";
		String dup="";
		
		for(int i=0; i<str.length(); ++i){
			for(int j=i+1; j<str.length(); ++j){
				if(str.charAt(i) == str.charAt(j))
					 dup = dup+str.charAt(i);
				    
			}
		}
		char[] arr = new char[dup.length()];
	     for(int i=0; i<dup.length(); ++i){
			arr[i]=dup.charAt(i);
		 }
		 
		 System.out.println(arr);
			
	}
}
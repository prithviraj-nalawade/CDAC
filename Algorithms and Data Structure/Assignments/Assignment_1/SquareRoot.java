public class SquareRoot{
	
	
	public static void main(String[] args){
	      int x=16, sq=1, r=0;
          for(int i=1; sq<=x; ++i){
			  sq = i*i;
			  r=i;
		  }		  
		  System.out.print(r-1);
	}
}
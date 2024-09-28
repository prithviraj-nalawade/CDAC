public class FactorialRecursive{
	int a=0;
	 void add(){
		
		a++;
		if(a <=10){
		System.out.println(a);
		add();
		}
		
			
	}
	
	int fact(int n){
		if(n==1)
			return n;
		else
			return n*fact(n-1);
	}
	
	
	public static void main(String[] args){
		Practice p = new Practice();
		System.out.println(p.fact(2))	;
	}
}
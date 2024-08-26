class Pg7{
	public static void main(String args[]){
		int a = 9876, total=0;
		while(a>0){
			int r = a % 10;
			total += r;
			a/=10;
			
			
			
		}
		System.out.print(total);
	}
}
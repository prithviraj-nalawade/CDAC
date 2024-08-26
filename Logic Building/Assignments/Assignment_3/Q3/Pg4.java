class Pg4{
	public static void main(String[] args){
        int a = 1234, r=0;
        while(a > 0){
			r = r * 10 + a % 10;
			a = a/10;
			
		}
		System.out.print(r);		
	}
}
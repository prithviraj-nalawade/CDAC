class Pg5{
	public static void main(String args[]){
		int a = 0, b = 1, c, i=0;
		System.out.print(a+" "+b);
		while(i<=21){
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
			i++;
			
		}
	}
}
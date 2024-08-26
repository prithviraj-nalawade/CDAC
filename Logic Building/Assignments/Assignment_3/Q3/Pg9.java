class Pg9{
	public static void main(String args[]){
		int a = 4825, largest=0;
		while(a>0){
			int r = a % 10;
			if(r>largest){
				largest = r;
			}
			a/=10;
		}
		System.out.print(largest);
	}
}
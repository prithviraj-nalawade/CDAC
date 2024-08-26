class Pg6{
	public static void main(String args[]){
		int count = 0;
        int num = 0;
        
        while (count < 5) {
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
	}
}
public class Query{
	public static void main(String[] args){
		int n=5;
		int[][] arr = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
		int[] arr1 = new int[n+1];
		 for (int[] i : arr) {
            int start = i[0];
            int end = i[1];
            int value = i[2];

            arr1[start] += value;   
            if (end + 1 <= n) {
                arr1[end + 1] -= value; 
            }
        }
		
		int max=0;
		int sum =0 ;
		for(int i=1; i<=n; ++i){
			sum+=arr1[i];
			if(sum>max){
				max = sum;
			}
		}
		System.out.println(max);
	}
	
}
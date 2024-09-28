public class RemoveDup{
	public static void main(String[] args){
		int arr[] = {0, 0, 1, 1, 2, 2, 3, 3};
		int idx=1;
		for(int i=1; i<arr.length; ++i){
			if(arr[i] != arr[i-1])
				arr[idx++] = arr[i];
		}
		
		System.out.println(idx);
		
		for(int i=0; i<idx; ++i){
			System.out.println(arr[i]);
		}
	}
}
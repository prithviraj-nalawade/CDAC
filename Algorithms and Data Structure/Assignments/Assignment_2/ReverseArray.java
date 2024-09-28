public class ReverseArray{
	static void rev(int arr[], int n){
		if(n == -1)
		   return;
	    System.out.println(arr[n]);
	    rev(arr, n-1);
	}
	
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4};
		rev(arr, arr.length-1);
	}
}
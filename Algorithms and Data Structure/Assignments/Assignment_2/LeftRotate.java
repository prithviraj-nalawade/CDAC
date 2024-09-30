import java.util.Arrays;

public class LeftRotate{
	public static void reverse(int[] arr, int s, int e){
		while(s<e){
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	
	public static void rotateL(int[] arr, int r){
		int n = arr.length;
		r = r%n;
		reverse(arr, 0, r-1);
		reverse(arr, r, n-1);
		reverse(arr, 0, n-1);
	}
	
	public static void main(String[] args){
		int[] arr={1, 2, 3, 4, 5};
		int d = 2;
		rotateL(arr, d);
		System.out.println(Arrays.toString(arr));
		
	}
}
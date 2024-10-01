public class KLargest{
	static void heapify(int arr[], int n, int i){
		int smallest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if(l<n && arr[l]>arr[smallest]){
			smallest = l;
		}
		if(r<n && arr[r]>arr[smallest]){
			smallest = r;
		}
		if(smallest != i){
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			heapify(arr, n, smallest);
		}
		
		
		
	}
	
	static void heapSort(int arr[]){
		int n = arr.length;
		for(int i=n/2-1; i>=0; --i){
			heapify(arr, n, i);
		}
		
		for(int i=n-1; i>=0; --i){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}
	static void display(int arr[], int k)
	{
		System.out.print(arr[arr.length - k]);
		
	}
	public static void main(String[] args){
		int arr[] = {3, 10, 5, 20, 15};
		int k = 3;
		heapSort(arr);
		display(arr, k);
	}
}
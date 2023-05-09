import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		
		int arr[] = {3, 2, 1, 5 , 6, 4};
		int k = 4;
		
		//function call
		System.out.print(k+"th largest element is : " + kthLargest(arr, k));

	}
	
	public static int kthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		
		return arr[arr.length - k];
	}

}

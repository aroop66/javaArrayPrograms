import java.util.Arrays;

public class KthSmallest {

	public static void main(String[] args) {
		
		int arr[] = {12, 3, 5, 7, 19};
		int k = 2;
		
		//Function call
		System.out.print(k+" smallest element is: " + kthSmallest(arr, k)); 

	}
	
	/*
	 * function to return k'th smallest
	 * element in a given array
	 */
	
	public static int kthSmallest(int[]arr, int k) {
		//sort the given array
		Arrays.sort(arr);
		
		/*
		 * Return k'th element in the 
		 * sorted array
		 */
		
		return arr[k-1];
		
	}

}

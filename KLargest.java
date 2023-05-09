import java.util.Arrays;
import java.util.Collections;

public class KLargest {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[] {1, 23, 12, 9, 30, 2, 50};
		int k = 2;
		
		kLargest(arr, k);
		
		System.out.println();

	}
	
	public static void kLargest(Integer[] arr, int k) {
		/*
		 * Sort the given array arr in reverse order
		 * This method doesn't work with primitive data types
		 * so instead of int, Integer type array will be used
		 */
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		//print the first k largest elements
		for(int i=0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

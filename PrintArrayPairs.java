import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintArrayPairs {

	public static void main(String[] args) {
		
		prettyPrint(new int[] {12, 14, 17, 15, 18, 19, 20, -11}, 9);
		prettyPrint(new int[] {2, 4, 7 ,5 , 9, 10, -1}, 9);

	}
	
	/*
	 * Given a number finds two numbers from an array so that the sum is equal to
	 */

	
	public static void printPairsUsingSet(int[] arr, int k) {
		if(arr.length < 2) {
			return;
		}
		
		Set<Object> set = new HashSet<>(arr.length);
		
		for(int num: arr) {
			int target = k - num;
			
			//if the target number is not in set then add value
			
			if(!set.contains(target)) {
				set.add(num);
			}else {
				System.out.printf("(%d, %d) %n", num, target);
			}
		}
	}
	
	
	/*
	 * utility method to print
	 * 
	 * two elements in an array that sum to k.
	 */
	
	public static void prettyPrint(int[] random, int k) {
		System.out.println("Input int array: " + Arrays.toString(random));
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k);
		
		//printPairsUsingTwoPointers(random,k)
		printPairsUsingSet(random, k);
	}
}

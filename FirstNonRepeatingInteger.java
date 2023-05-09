
public class FirstNonRepeatingInteger {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 1, 7, 6, 5, 4};
		int firstNonRepeating = findFirstNonRepeating(arr);
		System.out.println("The first non repeating number is: " + firstNonRepeating);

	}
	
	public static int findFirstNonRepeating(int[] arr) {
		//Create an array to store the number of times each element appears in the
		//array
		int[] counts = new int[arr.length];
		
		//loop through the array and count the number of times each element appears
		for(int i : arr) {
			counts[i]++;
		}
		
		//loop through the array again and find the first element with a count of i
		for(int i = 0; i < arr.length; i++) {
			if(counts[arr[i]] == 1) {
				return arr[i];
			}
		}
		
		//if no non repeating numbers were found, return -1
		return -1;
	}

}

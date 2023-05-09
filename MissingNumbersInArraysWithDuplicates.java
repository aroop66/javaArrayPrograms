import java.util.ArrayList;
import java.util.List;

/*
 * Time complexity overall O(N)
 * where creating frequency takes O(N+1)
 * Counting occurrences of each number in nums is O(N)
 * Iterating frequency takes O(N)
 */

public class MissingNumbersInArraysWithDuplicates {

	public static void main(String[] args) {

		int[] input = { 1, 1, 2, 3, 5, 5, 7, 7, 9, 10, 9 };

		List<Integer> missingNumbers = findMissingNumbers(input);

		System.out.println("Missing numbers in the given array:");
		for (int number : missingNumbers) {
			System.out.print(number + " ");
		}
	}

	public static List<Integer> findMissingNumbers(int[] nums) {
		List<Integer> missingNumbers = new ArrayList<>();

		// Create a frequency array to keep track of number occurrences
		int[] frequency = new int[nums.length + 1];

		// Count the occurrences of each number
		for (int num : nums) {
			frequency[num]++;
		}

		// Identify the missing numbers
		for (int i = 1; i < frequency.length; i++) {
			if (frequency[i] == 0) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}

}

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, 50, -88, 102};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			else if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Given array: " + Arrays.toString(numbers));
		System.out.println("Largest element: " + largest);
		System.out.println("Smallest element: " + smallest);

	}

}

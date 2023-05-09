import java.util.Arrays;

public class TopTwoMaximum {

	public static void main(String[] args) {
		
		topTwo(new int[] {20, 32, 21, 67, 92});

	}
	
	public static void topTwo(int[] numbers) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int number : numbers) {
			if(number > max1) {
				max2 = max1;
				max1 = number;
			}else if(number > max2) {
				max2 = number;
			}
		}
		
		System.out.println("Given array: " + Arrays.toString(numbers));
		System.out.println("First Maximum number: " + max1);
		System.out.println("Second maximum number: " + max2);
	}

}

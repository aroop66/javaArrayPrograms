import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingInteger {
	
	public static void main(String[] args) {
		
		int arr[] = {11, 2, 45,  7, 11, 4, 2};
		printFirstRepeating(arr);
		
	}
	
	public static void printFirstRepeating(int arr[]) {
		
		//Initialize index of first repeating element
		int min = -1;
		
		//Create an empty set
		Set<Integer> set = new HashSet<>();
		
		//Traverse the input array from right to left.
		for(int i = arr.length - 1; i >= 0; i--) {
			if(set.contains(arr[i])) {
				min = i;
			}else {
				set.add(arr[i]);
			}
		}
		
		//print the result
		if(min != -1) {
			System.out.println("The first repeating element is : " + arr[min]);
		}else {
			System.out.println("There are no repeating elements");
		}
	}
	
}

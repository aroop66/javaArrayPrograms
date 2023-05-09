import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 5, 7, 8, 7 };
		
		//brute force
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate elements: " + arr[i]);
				}
			}

		}

		System.out.println("--------------------");

		// using set
		Set<Integer> store = new HashSet<>();
		for (int num : arr) {
			if (store.add(num) == false) {
				System.out.println("Duplicate element is: " + num);
			}
		}

		System.out.println("---------------------");
		
		//Using hashmap
		Map<Integer, Integer> storeMap = new HashMap<>();
		for (int nums : arr) {
			Integer count = storeMap.get(nums);

			if (count == null) {
				storeMap.put(nums, 1);
			} else {
				storeMap.put(nums, ++count);
			}
		}

		for (Entry<Integer, Integer> entry : storeMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Elements: " + entry.getKey());
			}
		}

	}

}

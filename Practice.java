import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate elements are: " + arr[i]);
				}
			}
		}
		
		
		//using set
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(set.add(num) == false) {
				System.out.println("Duplicate elements are: " + num);
			}
		}
		
		
		//using hashmap
		Map<Integer, Integer> map = new HashMap<>();
		for(int nums : arr) {
			Integer count = map.get(nums);
			
			if(count == null) {
				map.put(nums, 1);
			}else {
				map.put(nums, ++count);
			}
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate elements are: " + entry.getKey());
			}
		}
	
	}
	

}
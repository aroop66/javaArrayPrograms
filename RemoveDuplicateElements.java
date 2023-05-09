import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int arr[] = { 1, 1, 2, 3, 3, 4, 5, 6, 7};
		
		removeDuplicatesUsingHashMap(arr);
		
		System.out.println();
		
		removeDuplicatesUsingSet(arr);

	}
	
	//using HashMap
	public static void removeDuplicatesUsingHashMap(int arr[]) {
		
		//declare a hashMap
		Map<Integer, Integer> map = new HashMap<>();
		int len = arr.length;
		
		//traverse an array
		for(int i = 0; i < len - 1; i++) {
			
			Integer count =map.get(arr[i]);
			
			//if key is already present in a map
			if(map.containsKey(arr[i])) {
				//Increment its count
				map.put(arr[i], count++);
			}else {
				/*
				 * if its not present in a map then put a key and its initial count 1
				 */
				map.put(arr[i], 1);
			}
		}
		
		//print each key
		map.forEach((k,v) -> System.out.print(k + " "));
		
	}
	
	//3. by using set
	
	public static void removeDuplicatesUsingSet(int arr[]) {
		
		//Declare set
		Set<Object> st = new HashSet<>();
		int len = arr.length;
		
		//Traverse an array and add element in a set
		for(int i = 0; i < len - 1; i++) {
			//it only adds unique values
			st.add(arr[i]);
		}
		
		st.forEach(elem -> System.out.print(elem + " "));
		
	}
	

}

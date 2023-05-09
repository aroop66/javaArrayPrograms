
public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 1, 3, 5, 4, 5, 4};
		
		//function call
		System.out.println("Element occurring once is: " + findUnique(arr));
		
	}
	
	//function to find the 
	public static int findUnique(int arr[]) {
		
		//iterate over every element
		for(int i = 0; i<arr.length; i++) {
			
			//initialize count to 0
			int count = 0;
			
			for(int j = 0; j < arr.length; j++) {
				
				//count the frequency
				//of the element
				
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			
			//if the frequency of the
			//element is one
			if(count == 1) {
				return arr[i];
			}
		}
		
		//if no element exist at most once
		return -1;
	}

}

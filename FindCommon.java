
public class FindCommon {

	public static void main(String[] args) {
		
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 38, 70, 80, 120};
		
		System.out.println("Common elements are: ");
		findCommon(ar1, ar2, ar3);

	}

	// this function prints the common elements in ar1
	public static void findCommon(int ar1[], int ar2[], int ar3[]) {
		// Initialize starting indexes for ar1[], ar2[] and ar3[]

		int i = 0, j = 0, k = 0;

		// iterate through three arrays while all arrays have elements

		while (i < ar1.length && j < ar2.length && k < ar3.length) {
			// if x = y and y = z print any of them and move ahead in all arrays
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i] + " ");
				i++;
				j++;
				k++;
			}

			else if (ar1[i] < ar2[j]) {
				i++;
			}

			else if (ar2[j] < ar3[k]) {
				j++;
			}

			else
				k++;
		}

	}

}

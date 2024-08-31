package sortingAndSearching.qus13;

import java.util.Arrays;

public class CountTriplet {

	public static void main(String[] args) {
//		int N = 4, sum = 2;
//		long arr[] = {-2, 0, 1, 3};
		int N = 5, sum = 12;
		long arr[] = {5, 1, 3, 4, 7};
		System.out.println(countTriplets(arr, N, sum));
	}
	
	static long countTriplets(long arr[], int n, int sum) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < n; i++) {
			int start = i + 1;
			int end = n - 1;
			while (start < end) {
				long total = arr[i] + arr[start] + arr[end];
				if (total < sum) {
					count += end - start;
					start++;
				} else {
					end--; 
				}
			}
		}
		return count;
    }

}

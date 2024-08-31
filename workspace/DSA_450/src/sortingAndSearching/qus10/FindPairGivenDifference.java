package sortingAndSearching.qus10;

import java.util.Arrays;
import java.util.HashSet;

public class FindPairGivenDifference {

	public static void main(String[] args) {
		int L = 5, N = 45;
		int arr[] = {90, 70, 20, 80, 50};
		System.out.println(findPairI(arr, L, N));
	}
	
	public static boolean findPair(int arr[], int size, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			int start = i + 1; 
			int end = size - 1;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				int diff = arr[mid] - arr[i];
				if (diff == n) {
					return true;
				} else if (diff > n) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return false;
	}
	
	public static boolean findPairI(int arr[], int size, int n) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (set.contains(i - n) || set.contains(i + n)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}

}

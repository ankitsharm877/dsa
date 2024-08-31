package sortingAndSearching.qus17;

import java.util.Arrays;

public class SortedArrayInBitCount {

	public static void main(String[] args) {
		Integer arr[] = {1, 2, 3, 4, 5, 6};;
		sortBySetBitCount(arr, arr.length);
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
	public static void sortBySetBitCount(Integer arr[], int n) {
		Arrays.sort(arr, (a, b) -> {
			Integer c1 = countBit(a);
			Integer c2 = countBit(b);
			return c2.compareTo(c1);
		});
	}
	
	public static int countBit(int x) {
		int count = 0;
		while (x != 0) {
			int a = x % 2;
			int b = x / 2;
			if (a == 1) {
				count++;
			}
			x = b;
		}
		return count;
	}
}

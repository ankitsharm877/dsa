package example2;

import java.util.Arrays;

public class Day6 {

	public static void main(String[] args) {
		int[] arr = {3,8,6,1,9,7,9};
		//int[] arr = {1,2,3,4,5,6};
		System.out.println(isSorted(arr, 0));
		System.out.println(findFirst(arr, 0, 9));
		System.out.println(findLast(arr, 0, 9));
		System.out.println(Arrays.toString(allIndices(arr, 0, 0, 9)));
		printPattern(5,1,1);
	}

	private static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			return isSorted(arr, si + 1);
		}
	}
	
	private static int findFirst(int[] arr, int si, int key) {
		if (si == arr.length) {
			return -1;
		} else {
			if (arr[si] == key) {
				return si;
			} else {
				return findFirst(arr, si + 1, key);
			}
		}
	}
	
	private static int findLast(int[] arr, int si, int key) {
		if (arr.length == si) {
			return -1;
		}
		int lastIndex = findLast(arr, si + 1, key);
		if (lastIndex == -1) {
			if (arr[si] == key) {
				return si;
			} else {
				return lastIndex;
			}
		} else {
			return lastIndex;
		}
	}
	
	public static int[] allIndices(int[] arr, int si, int count, int key) {
		if (si == arr.length) {
			int[] br = new int[count];
			return br;
		}
		int[] allIndices = null;
		if (arr[si] == key) {
			allIndices = allIndices(arr, si + 1, count + 1, key);
		} else {
			allIndices = allIndices(arr, si + 1, count, key);
		}
		
		if (arr[si] == key) {
			allIndices[count] = si;
		}
		return allIndices;
	}
	
	public static void printPattern(int N, int row, int col) {
		if (row > N) {
			return;
		}
		if (col > row) {
			System.out.println("");
			printPattern(N, row + 1, 1);
			return;
		}
		System.out.print("*");
		printPattern(N, row, col + 1);
	}
	
}

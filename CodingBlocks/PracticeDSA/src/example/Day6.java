package example;

import java.util.Arrays;

public class Day6 {
	
	public static void main(String[] args) {
		int[] arr = {3,8,6,1,9,7,9};
		//int[] arr = {1,2,3,4,5,6};
		System.out.println(isSorted(arr, 0));
		System.out.println(findFirst(arr, 0, 3));
		System.out.println(Arrays.toString(allIndices(arr, 0, 0, 9)));
		printPattern(5,1,1);
	}
	//T.C = O(n), S.C = O(1)
	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			return isSorted(arr, si + 1);
		}
	}

	//T.C = O(n), S.C = O(1)
	public static int findFirst(int[] arr, int si, int key) {
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
	//T.C = O(n), S.C = O(1)
	public static int findLast(int[] arr, int si, int key) {
		if (si == arr.length) {
			return -1;
		} else {
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
	}
	// T.C = O(n), S.C = (n)
	public static int[] allIndices(int[] arr, int si, int count, int key) {
		if (si == arr.length) {
			int[] br = new int[count];
			return br;
		}
		int[] indices = null;
		if (arr[si] == key) {
			indices = allIndices(arr, si + 1, count + 1, key);
		} else {
			indices = allIndices(arr, si + 1, count, key);
		}
		
		if (arr[si] == key) {
			indices[count] = si;
		}
		return indices;
	}
	// T.C = O(N * logN), S.C = O(1)
	public static void printPattern(int N, int row, int col) {
		// +ve bc
		if (row >  N) {
			return;
		}
		// -ve bc
		if (col > row) {
			System.out.println("");
			printPattern(N, row + 1, 1);
			return;
		}
		System.out.print("*");
		printPattern(N, row, col + 1);
	}
	
	// T.C = O(N^2), S.C = O(1)
	public static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}
		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}
		
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}
		bubbleSort(arr, si + 1, li);
	}
}

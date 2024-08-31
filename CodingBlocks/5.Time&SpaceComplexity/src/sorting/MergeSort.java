package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
		int[] ans = mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		// +ve bc
		if (low == high) {
			int[] br = new int[1];
			br[0] = arr[low];
			return br;
		}
		int mid = (low + high) / 2;
		int[] fh = mergeSort(arr, low, mid);
		int[] sh = mergeSort(arr, mid + 1, high);
		int[] merge  = mergeTwoSortedArray(fh, sh);
		return merge;
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2)  {
		int[] mergedArr = new int[arr1.length + arr2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			} else if (arr1[i] > arr2[j]) {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		if (i == arr1.length) {
			while (j < arr2.length) {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			}
		}
		return mergedArr;
	}

}

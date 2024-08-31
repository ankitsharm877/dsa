package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		int[] arr2 = {5, 15, 25};
		int[] arr = mergeTwoSortedArray(arr1, arr2);
		System.out.println(Arrays.toString(arr));
		
		int[] nums = {10, 40, 20, 60,30};
		nums = mergeSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		return merged;
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] br = new int[1];
			br[0] = arr[low];
			return br;
		}
		int mid = (low  + high) / 2;
		int[] fh = mergeSort(arr, low, mid);
		int[] sh = mergeSort(arr, mid + 1, high);
		int[] merge = mergeTwoSortedArray(fh, sh);
		return merge;
 	}
}

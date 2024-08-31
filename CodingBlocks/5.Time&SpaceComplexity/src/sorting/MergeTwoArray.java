package sorting;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {5,15,30,45,60,70,80};
		System.out.println(Arrays.toString(mergeTwoSortedArray(arr1, arr2)));
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

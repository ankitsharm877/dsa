package sap1;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8};
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			} else {
				ans[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		System.out.println(Arrays.toString(ans));
	}

}

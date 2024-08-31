package array.qus12;

import java.util.Arrays;

public class Merge2SortedArray {

	public static void main(String[] args) {
		long arr1[] = {1, 3, 5, 7};
		long arr2[] = {0, 2, 6, 8, 9};
		int n = 4;
		int m = 5;
		//{1,3,2,0}
		//{7,5,6,8,9}
		//arr1[] = [0 1 2 3]
		//arr2[] = [5 6 7 8 9]
		merge(arr1, arr2, n, m);
		display(arr1);
		display(arr2);
	}
	
	public static void merge(long arr1[], long arr2[], int n, int m) {
		int i = n - 1;
		int j = 0;
		while (i > -1 && j < m) {
			if (arr1[i] > arr2[j]) {
				 long temp = arr1[i];
				 arr1[i] = arr2[j];
				 arr2[j] = temp;
			}
			 j++;
			 i--;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
    }
	
	public static void display (long[] arr) {
		for (long val: arr) {
			System.out.print(val + " ");
		}
		System.out.println("");
	}

}

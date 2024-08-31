package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,40,50,20,60};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		int pivot = arr[mid];
		int left = low;
		int right = high;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			
			while (arr[right] > pivot) {
				right--;
			}
			
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}

}

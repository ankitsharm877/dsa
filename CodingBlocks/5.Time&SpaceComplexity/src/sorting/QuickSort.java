package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		// +ve bc
		if (low >= high) {
			return;
		}
		
		//1. partitioning
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
		
		//2. smaller problems
		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}

}

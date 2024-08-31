package example6;

import java.util.Arrays;

public class Day2 {

	public static void main(String[] args) {
		int[] arr = {10,30,20,60,50,40};
		System.out.println(Arrays.toString(arr));
		//bubbleSort(arr); // inplace
		//selectionSort(arr); //inplace
		//insertionSort(arr); //inplace
		//arr = mergeSort(arr, 0 , arr.length - 1); // not inplace
		quickSort(arr, 0, arr.length - 1); // inplace
		System.out.println(Arrays.toString(arr));
		
//		int[] arr1 = {10,20,30,40,50,60};
//		int[] arr2 = {5,15,25,35};
//		int[] merged = mergeTwoSortedArray(arr1, arr2);
//		System.out.println(Arrays.toString(merged));

	}
	
	public static void bubbleSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1]= temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter]= temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		for (int counter = 0; counter < arr.length; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = val;
		}
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0; 
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k++] = arr2[j++];
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k++] = arr1[i++];
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
		int mid = (low + high) / 2;
		int[] fh =  mergeSort(arr, low, mid);
		int[] sh = mergeSort(arr, mid + 1, high);
		int[] merged = mergeTwoSortedArray(fh, sh);
		return merged;
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

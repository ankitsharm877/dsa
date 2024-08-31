package example4;

import java.util.Arrays;

public class Day2 {

	public static void main(String[] args) {
		int[] arr = {10,30,20,60,50,40};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr); // inplace
		//selectionSort(arr); //inplace
		//insertionSort(arr); //inplace
		//arr = mergeSort(arr, 0 , arr.length - 1); // not inplace
//		quickSort(arr, 0, arr.length - 1); // inplace
		System.out.println(Arrays.toString(arr));
//		
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
					arr[j + 1] = temp;
				}
			}
		}
	}

}

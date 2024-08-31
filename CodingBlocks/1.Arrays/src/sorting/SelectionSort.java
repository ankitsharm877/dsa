package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {99, 88, 77, 66, 55};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}
	}

}

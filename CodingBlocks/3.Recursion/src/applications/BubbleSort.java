package applications;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,4,2,4,6};
		bubbleSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr, int si, int li) {
		if (li == 0) {
			return;
		}
		if (si == li) {
			bubbleSort(arr, 0, li - 1);
			return;
		}
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
		}
		bubbleSort(arr, si + 1, li);
	}

}

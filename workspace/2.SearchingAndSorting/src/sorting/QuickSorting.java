package sorting;

public class QuickSorting {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		quickSort(A, 0, A.length - 1);
		display(A);

	}
	
	public static void quickSort(int[] arr, int l, int h) {
		if (l < h) {
			int j = partition(arr, l, h);
			quickSort(arr, l, j - 1);
			quickSort(arr, j + 1, h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l - 1;
		for (int j = l; j <= h; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, h);
		return (i + 1);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}

}

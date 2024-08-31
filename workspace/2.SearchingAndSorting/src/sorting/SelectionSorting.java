package sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		selectionSorting(A);
		display(A);

	}
	
	public static void selectionSorting(int[] arr) {
		int i, j, k;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = k = i; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			int x = arr[i];
			arr[i] = arr[k];
			arr[k] = x;
		}
	}

	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}
}

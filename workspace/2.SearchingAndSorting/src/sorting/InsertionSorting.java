package sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		insertionSorting(A);
		display(A);

	}
	
	public static void insertionSorting(int[] arr) {
		int i, j, x;
		for (i = 1; i < arr.length; i++) {
			j = i - 1;
			x = arr[i];
			while (j > -1 && arr[j] > x) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
	}

	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}
}

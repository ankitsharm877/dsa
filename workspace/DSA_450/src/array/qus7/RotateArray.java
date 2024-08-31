package array.qus7;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
		int n = 8;
		rotate(arr, n);
		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	public static void rotate(int arr[], int n) {
		int last = arr[n - 1];
        for (int index = n - 1; index > 0; index--) {
        	swap(arr, index, index - 1);
        }
        arr[0] = last;
    }
	
	public static void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}

}

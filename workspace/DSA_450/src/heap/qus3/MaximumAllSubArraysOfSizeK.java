package heap.qus3;

public class MaximumAllSubArraysOfSizeK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;
        printKMax(arr, arr.length, K);
	}

	public static void printKMax(int[] arr, int n, int k) {
		for (int i = 0; i <= n - k; i++) {
			int max = arr[i + 0];
			for (int j = 1; j < k; j++) {
				if (arr[i + j] > max) {
					max = arr[i + j];
				}
			}
			System.out.println(max);
		}
	}
}

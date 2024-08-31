package array.qus9;

public class MinDiff {

	public static void main(String[] args) {
		int arr[] = {1, 5, 8, 10}; // {3, 9, 12, 16, 20}
		int n = 4;
		int k = 2;
		System.out.println(getMinDiff(arr, n, k));
	}
	
	 static int getMinDiff(int[] arr, int n, int k) {
		 int max[] = new int[n];
		 int min[] = new int[n];
		 
		 for (int i = 0; i < n; i++) {
			 max[i] = arr[i] + k;
			 min[i] = arr[i] - k;
		 }
		 for (int j = 0; j < n; j++) {
			 if (min[j] < max[j]) {
				 arr[j] = min[j] < 0 ? max[j] : min[j];
			 } else {
				 arr[j] = max[j] < 0 ? min[j] : max[j];
			 }
		 }
		 int max1 = arr[0];
		 int min1 = arr[0];
		 for (int i =0; i< n;i++) {
			 if (arr[i] > max1) {
				 max1 = arr[i];
			 } else if (arr[i] < min1) {
				 min1 = arr[i];
			 }
		 }
		 return max1 - min1;
	 }

}

package array.qus29;

public class TrappingRainWater {

	public static void main(String[] args) {
		int N = 10;
		int arr[] = {1, 1, 5, 2, 7, 6, 1, 4, 2, 3};
		System.out.println(trappingWater(arr, N));

	}
	
	static long trappingWater(int arr[], int n) {
		int i = 0;
		int j = n - 1;
		int max = 0;
		int ans = 0;
		while (i < j) {
			int start = arr[i];
			int end = arr[j];
			int k = start < end ? start : end;
			for (int m = i; m <= j; m++) {
				ans += (k - arr[m]) > 0 ? (k - arr[m]) : 0;
			}
			System.out.println(ans);
			if (ans > max) {
				max = ans;
			}
			ans = 0;
			i++;
			j--;
		}
		return max;
	}

}

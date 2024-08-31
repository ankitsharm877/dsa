package array.qus8;

public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // out = 6
		int n = 9;
		System.out.println(maxSubarraySum(arr, n));

	}

	static long maxSubarraySum(int arr[], int n) {
		long prev = arr[0];
        long max = arr[0];
        for(int i = 1; i < n; i++){
            prev = Math.max(arr[i], arr[i]+prev);
            max = Math.max(max, prev);
        }
        return max;
		
    }
}

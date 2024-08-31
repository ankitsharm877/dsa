package array.qus3;

import java.util.Arrays;

public class KthMinAndMaxInArray {

	public static void main(String[] args) {
		int[] arr = {7, 10, 4, 20, 15};
		System.out.println(kthSmallest(arr, 0, 4, 4));
	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k) {
		Arrays.sort(arr, l, r + 1);
		return arr[k - 1]; 

    }

}

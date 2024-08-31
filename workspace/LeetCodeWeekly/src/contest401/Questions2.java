package contest401;

import java.util.Arrays;

public class Questions2 {

	public static void main(String args[]) {
		int n = 4, k = 5;
		int[] A = new int[n];
		Arrays.fill(A, 1);
		for (int j = 0; j < k; j++) {
			for (int i = 1; i < n; i++) {
				A[i] = A[i - 1] + A[i];
			}
		}
		long M = 1000000007;
		System.out.println((A[n - 1] / M));
	}
}

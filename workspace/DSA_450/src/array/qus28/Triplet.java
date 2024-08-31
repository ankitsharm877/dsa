package array.qus28;

import java.util.HashMap;

public class Triplet {

	public static void main(String[] args) {
		int n = 6, X = 13;
		int arr[] = {1, 4, 45, 6, 10, 8};
		System.out.println(find3Numbers(arr, n, X));

	}
	
	public static boolean find3Numbers(int A[], int n, int X) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int partner = X - A[i] - A[j];
				if (hm.containsKey(partner) && A[i] != A[j]) {
					return true;
				} else {
					hm.put(A[i], i);
				}
			}
		}
		return false;
	}
}

package leetcode;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {
//		0 -> 0
//		1 -> 1
//		2 -> 10
//		3 -> 11
//		4 -> 100
//		5 -> 101
//		6 -> 110
//		7 -> 111
//		8 -> 1000
//		9 -> 1001
//		10 -> 1010
//		11 -> 1011
//		12 -> 1100
//		13 -> 1101
//		14 -> 1110
//		15 -> 1111
//		
//		15 => 7 + 1
//		14 => 7 + 0
//		13 => 6 + 1
//		12 => 6 + 0
//		11 => 5 + 1
//		10 => 5 + 0
		
		int n = 10000;
		//System.out.println(Arrays.toString(countingBits(n, new int[n + 1])));
		System.out.println(Arrays.toString(countingBitsBU(n)));
	}

	public static int[] countingBits(int n, int[] result) {
		if (n == 0 || n == 1) {
			result[n] = n;
			return result;
		}
		countingBits(n - 1, result);
		result[n] = result[n / 2] + (n % 2);
		return result;
	}
	
	public static int[] countingBitsBU(int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = result[i / 2] + (i % 2);
		}
		return result;
	}
}

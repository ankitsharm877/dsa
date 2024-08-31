package epam;

import java.util.Arrays;

public class FirstMissingPositiveNumber {

	public static void main(String[] args) {
		missingNumber(new int[] {1,2,0});
		missingNumber(new int[] {7,8,9,10});
		missingNumber(new int[] {2,3,-1,0});
		missingNumber(new int[] {});
		missingNumber(new int[] {2});
		missingNumber(new int[] {1});
	}
	public static void missingNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				k++;
			}
		}
		System.out.println("Missing Number: " + k);
	}

}

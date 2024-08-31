package applications;

import java.util.Arrays;
import java.util.HashMap;

public class CheckSubArraySumEqualTo0 {

	public static void main(String[] args) {
		int[] arr = {3, -5, -8, 9, -1};
		System.out.println(Arrays.toString(arr));
		System.out.println(check(arr));
	}
	
	public static boolean check(int[] arr) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		int preSum = 0;
		for (int val : arr) {
			preSum = preSum + val;
			if (preSum == 0 || hm.containsKey(preSum)) {
				return true;
			} else {
				hm.put(preSum, true);
			}
		}
		return false;
	}
}

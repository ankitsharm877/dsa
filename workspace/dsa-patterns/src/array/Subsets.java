package array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		subsetsI(nums);
		//Number of Subsets of an array of size N = 2^N
	}
	
	//Backtracking: Time Complexity: O(N*2^N)
	public static void subsets(int[] nums) {
		List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int index = 0;
        calcSubset(nums, res, subset, index);
        System.out.println(res);
	}

	public static void calcSubset(int[] A, List<List<Integer>> res, List<Integer> subset, int index) {
		res.add(new ArrayList<>(subset));
		for (int i = index; i < A.length; i++) {
			subset.add(A[i]);
			calcSubset(A, res, subset, i + 1);
			subset.remove(subset.size() - 1);
		}
	}
	
	//Bit Manipulation: Time Complexity: O(2^N)
	public static void subsetsI(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < (1 << n); i++) {
			List<Integer> subset = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					subset.add(nums[j]);
				}
			}
			res.add(subset);
		}
		System.out.println(res);
	}
}

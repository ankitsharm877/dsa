package application;

import java.util.HashSet;

public class MinAndMaxXOR {

	public static void main(String[] args) {
		int[] nums = {3,10,5,25,2,8};
		System.out.println(findMaximumXOR(nums));
	}
	
	public static int findMaximumXOR(int[] nums) {
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
           ans = solve((ans | (1<<i)), nums, ans);
        }
        return ans;
    }
    public static int solve(int target, int[] nums, int ans) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            int digit = num & target;
            if(set.contains(digit^target)) { 
                ans=target;   
                return ans;
            }
            set.add(digit);
        }
        return ans;
    }

}

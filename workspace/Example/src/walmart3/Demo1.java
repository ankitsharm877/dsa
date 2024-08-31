package walmart3;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		// [1,2,3, ,100]
		// one number is two times

		int[] arr = {1,2,3,3,4,5,6};
		System.out.println(findDuplicateNumberII(arr));
	}
	
	public static int findDuplicateNumber(int[] arr) { // O(N)
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) { // O(N)
			boolean duplicate =  set.add(arr[i]);
			if (!duplicate) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static int findDuplicateNumberI(int[] nums) { // O(N)
		int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
	}
	
	public static int findDuplicateNumberII(int[] nums) {
		for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
	}

}

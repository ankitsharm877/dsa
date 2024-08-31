package applications;

public class IsSortedArray {

	public static void main(String[] args) {
		//int[] nums = {3,8,6,1,9,7};
		int[] nums = {1,2,3,4,5,6};
		System.out.println(isSorted(nums, 0));
	}
	
	public static boolean isSorted(int[] nums, int idx) {
		if (nums.length - 1 == idx) {
			return true;
		}
		if (nums[idx] > nums[idx + 1]) {
			return false;
		} else {
			return isSorted(nums, idx + 1);
		}
	}

}

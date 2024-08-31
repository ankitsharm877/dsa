package searching;

public class LinearSearching {

	public static void main(String[] args) {
		int[] nums = {2,4,6,8,9};
		int key = 4;
		System.out.println(linearSearching(nums, key));
	}
	
	public static int linearSearching(int[] nums, int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return i;
			}
		}
		return -1;
	}

}

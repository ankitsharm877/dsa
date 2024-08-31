package walmart.round1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] nums = {1,2,0};
		sort012(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sort012(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(nums, low, mid);
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, high);
				high--;
			}
		}
	} 
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	
}

package example4;

import java.util.Arrays;

public class Day1 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr, 4));
		
		int[] nums = {0,1,2,3,3,3,4,5};
		System.out.println(lowerBound(nums, 3));
		System.out.println(upperBound(nums, 3));
		
		int[] list = {0,1,2,2,0,1,1,0};
		sort012(list);
		System.out.println(Arrays.toString(list));

	}
	
	public static int binarySearch(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == nums[mid]) {
				return mid;
			} else if (key < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static int lowerBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == nums[mid]) {
				ans = mid;
				high = mid - 1;
			} else if (key < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	
	public static int upperBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == nums[mid]) {
				ans = mid;
				low = mid + 1;
			} else if (key < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
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
	
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}

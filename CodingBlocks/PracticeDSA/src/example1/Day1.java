package example1;

import java.util.Arrays;

public class Day1 {

	public static void main(String[] args) {
		int[] nums = {1,2,4,4,4,6,7,8};
		System.out.println(binarySearch(nums, 6));
		System.out.println(lowerBound(nums, 4));
		System.out.println(upperBound(nums, 4));
		
		int[] arr = {1,2,0,2,0,1,1};
		sort012(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid =(low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key <  arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static int lowerBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				ans = mid;
				high = mid - 1;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	public static int upperBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				ans = mid;
				low = mid + 1;
			} else if (key < arr[mid]) {
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
				mid++;
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

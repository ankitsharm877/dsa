package example;

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
	
	// T.C = O(log n), S.C = O(1)
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	// T.C = O(log n), S.C = O(1)
	public static int lowerBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
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
	
	// T.C = O(log n), S.C = O(1)
	public static int upperBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
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
	
	// T.C = O(n), S.C = O(1)
	public static void sort012(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}
	
	private static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

package searching;

public class BinearySearching {

	public static void main(String[] args) {
		
		int[] nums = {2,4,6,8,9};
		int key = 4;
		System.out.println(binarySearch(nums, 0, nums.length - 1, key));
	}
	
	public static int binarySearch(int[] arr, int l, int h, int key) {
		while (l <= h) {
			int mid = (l + h) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				h = mid - 1; 
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchR(int[] arr, int l, int h, int key) {
		while (l <= h) {
			int mid = (l + h) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				return binarySearchR(arr, l, mid - 1, key);
			} else {
				return binarySearchR(arr, mid + 1, h, key);
			}
		}
		return -1;
	}

}

package array1D;

public class LowerAndUpperBound {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4};
//		System.out.println(lowerBoundI(arr, 2));
//		System.out.println(lowerBoundI(arr, 3));
//		System.out.println(lowerBoundI(arr, 7));
//		System.out.println(lowerBoundII(arr, 2));
//		System.out.println(lowerBoundII(arr, 3));
//		System.out.println(lowerBoundII(arr, 7));

		System.out.println(upperBoundI(arr, 2));
		System.out.println(upperBoundI(arr, 3));
		System.out.println(upperBoundI(arr, 7));
		System.out.println(upperBoundI(arr, 4));
		System.out.println(upperBoundII(arr, 2));
		System.out.println(upperBoundII(arr, 3));
		System.out.println(upperBoundII(arr, 7));
		System.out.println(upperBoundII(arr, 4));

	}
	
	// O(n)
	public static int lowerBoundI(int[] arr, int data) {
		int low = 0;
		while (low < arr.length) {
			if (data > arr[low]) {
				low++;
			} else {
				return low;
			}
		}
		return low >= arr.length ? -1 : low;
	}
	
	public static int lowerBoundII(int[] arr, int data) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == data) {
				ans = mid;
				high = mid - 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
	
	public static int upperBoundI(int[] arr, int data) {
		int high = 0;
		while (high < arr.length) {
			if (arr[high] <= data) {
				high++;
			} else {
				return high - 1;
			}
		}
		return high >= arr.length ? -1 : high;
	}
	
	public static int upperBoundII(int[] arr, int data) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == data) {
				ans = mid;
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}

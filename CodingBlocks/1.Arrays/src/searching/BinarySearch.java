package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4};
		System.out.println(binarySearch(arr, 3));
		System.out.println(binarySearch(arr, 13));
	}
	
	public static int binarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}

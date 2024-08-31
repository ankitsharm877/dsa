package searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4};
		System.out.println(linearSearch(arr, 3));
		System.out.println(linearSearch(arr, 13));
	}
	
	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}
 
}

package array1D;

public class ArraySwapDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		//not working swap
		int i = 0, j = 2;
//		System.out.println(arr[i] + ", " + arr[j]);
//		swap(arr[i], arr[j]);
//		System.out.println(arr[i] + ", " + arr[j]);
		
		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);
		
		//not working swap
		int[] other = {100, 200, 300};
		System.out.println(arr[0] + ", " + other[0]);
		swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}
	
	public static void swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}


}

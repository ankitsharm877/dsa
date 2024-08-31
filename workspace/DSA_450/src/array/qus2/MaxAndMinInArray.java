package array.qus2;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int[] arr = {22, 14, 8, 17, 35, 3};
		minMax(arr);
	}
	
	static void minMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index]) {
				min = arr[index];
			}
			if (max < arr[index]) {
				max = arr[index];
			}
			
		}
		System.out.println("Min: " + min + ", Max: " + max);
	}

}

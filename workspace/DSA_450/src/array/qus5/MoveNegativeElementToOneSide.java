package array.qus5;

public class MoveNegativeElementToOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		moveToLeft(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		int[] arr1 = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		moveToLeftI(arr1);
		for (int i : arr1) {
			System.out.println(i);
		}
	}
	
	static void moveToLeft(int[] arr) {
		int end = arr.length - 1;
		for (int index = 0; index < end; index++) {
			if (arr[index] > 0) {
				int x = arr[end];
				arr[end] = arr[index];
				arr[index] = x;
				end--;
			}
		}
	}
	
	static void moveToLeftI(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			while (arr[start] < 0) {start++;}
			while (arr[end] >= 0) {end--;}
			if (start < end) {
				int x = arr[end];
				arr[end] = arr[start];
				arr[start] = x;
			}
		}
	}

}

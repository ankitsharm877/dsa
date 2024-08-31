package main;

public class ShiftAndRotation {

	public static void main(String[] args) {
		int[] arr = {2,3,5,7,8,9,13,16,19};
		leftShift(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
		int[] arr1 = {2,3,5,7,8,9,13,16,19};
		leftRotation(arr1);
		for (int i : arr1) {
			System.out.println(i);
		}
	}

	static void leftShift(int[] a) {
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = 0;
	}
	
	static void leftRotation(int[] a) {
		int x = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = x;
	}
}

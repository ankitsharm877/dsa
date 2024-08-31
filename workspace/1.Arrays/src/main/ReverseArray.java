package main;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {2,3,5,7,8,9,13,16,19};
		reverseI(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	static void reverse(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[a.length - i - 1] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}
	
	static void reverseI(int[] a) {
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			int x = a[i];
			a[i] = a[j];
			a[j] = x;
		}
	}
}

package array1D;

import java.util.Scanner;

public class ArrayOps {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int[] arr = takeInput();
//		display(arr);
		int[] arr = {10, 5, 20, 30, 25};
		System.out.println(maxInArray(arr));
	}
	
	public static int[] takeInput() {
		System.out.println("Size?");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value for " + i + " index ? ");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int maxInArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}

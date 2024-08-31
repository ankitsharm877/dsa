package array2D;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println(arr);
		display(arr);
		//System.out.println(arr[0][0]);
		System.out.println("***************");
		arr[0][0] = 10;
		arr[2][0] = 20;
		display(arr);
	}
	
	public static void display(int[][] arr) {
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));			
		}
	}

}

package array1D;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//declare
		int[] arr = null;
		System.out.println(arr);
		
		//allocate space
		arr = new int[5];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		//get
		System.out.println(arr[0]);
		
		//set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		
		//print
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
		
		// Enhanced for loop
		// Limitation : (1) forward only, (2) read only
		for (int val : arr) {
			System.out.print(val + ", ");
		}
		
	}
}

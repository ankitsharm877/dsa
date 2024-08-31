package nagarro;

import java.util.Arrays;

public class Find2ndLargestElementIntheArray {

	public static void main(String[] args) {
		Integer[] arr = {12, 35, 1, 10, 34, 1};
		//largest2ndI(arr);
		largest2ndII(arr);
	}

	public static void largest2ndI(Integer[] arr) {
		Arrays.sort(arr, (a,b) -> b - a);
		for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                System.out.print(arr[i]);
                return;
            }
        }
	}
	
	public static void largest2ndII(Integer[] arr) {
		if (arr.length < 2) {
			System.out.println("-1");
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2 && arr[i] != max1) {
				max2 = arr[i];
			}
		}
		if (max2 != Integer.MIN_VALUE) {			
			System.out.println(max2);
		}
	}

}

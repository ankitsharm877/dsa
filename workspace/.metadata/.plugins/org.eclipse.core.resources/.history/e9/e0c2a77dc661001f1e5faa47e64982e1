package walmart2;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// 3 x 3 -> rotate by 90
		int[][] arr = { {1,2,3,4}, 
						{5,6,7,8}, 
						{9,10,11,12},
						{13,14,15,16}};
		int[][] out = { {13,9,5,1},
						{14,10,6,2},
						{15,11,7,3},
						{16,12,8,4}};
		
		int[][] ans = rotate(arr);
		for (int[] a : ans) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static int[][] rotate(int[][] arr) { //O( n * n = n^2)
		int[][] ans = new int[arr.length][arr[0].length];
		//i = 0, j = 0; -> x = 0, y = 2
		//i = 0, j = 1; -> x = 1, y = 2
		//i = 0, j = 2; -> x = 2, y = 2
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				ans[j][arr.length - 1 - i] = arr[i][j];
			}
		}
		return ans;
	}

}

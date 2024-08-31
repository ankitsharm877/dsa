package matrix.qus3;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int R = 3, C = 3;
		int M[][] = {{1, 3, 5}, 
				     {2, 6, 9}, 
				     {3, 6, 9}};
		System.out.println(median(M, R, C)); //{1,2,3,3,5,6,6,9,9}

	}
	
	static int median(int matrix[][], int R, int C) {
		int n = R * C;
		int[] arr = new int[n];
		int index = 0;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				arr[index] = matrix[i][j];
				index++;
			}
		}

		Arrays.sort(arr);
		int ans = arr[(n - 1) / 2];
		return ans; 
    }

}

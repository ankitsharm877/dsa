package matrix.qus5;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int N=4;
		int Mat[][]= {{10,20,30,40},
				{15,25,35,45}, 
				{27,29,37,48},
				{32,33,39,50}};
		sortedMatrix(N, Mat);
		display(Mat);
	}
	
	static int[][] sortedMatrix(int N, int Mat[][]) {
		int[] arr = new int[N * N];
		int index = 0;
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat[i].length; j++) {
				arr[index++] = Mat[i][j];
			}
		}
		Arrays.sort(arr);
		index = 0;
		for (int i = 0; i < Mat.length; i++) {
			for (int j = 0; j < Mat[i].length; j++) {
				Mat[i][j] = arr[index++];
			}
		}
		return Mat;
    }
	
	static void display(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}

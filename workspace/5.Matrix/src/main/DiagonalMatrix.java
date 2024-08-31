package main;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int[][] M = {{1,0,0},{0,1,0},{0,0,1}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + ", ");				
			}
			System.out.println("");
		}
	}

	//convert diagonal matrix into array
	public static void set(int[] A, int i, int j, int x) {
		if (i == j) {
			A[i] = x;
		}
	}
	
	public static int get(int[] A, int i, int j) {
		if (i == j) {
			return A[i];
		} else {
			return 0;
		}
	}
}

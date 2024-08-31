package main;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		int[][] M = {{1,1,1},{0,1,1},{0,0,1}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + ", ");				
			}
			System.out.println("");
		}
	}
	
	public static void set(int[] A, int i, int j, int x, int n) {
		if (i >= j) {
			A[(i - 1) * n - (j - 2)*(j - 1) / 2 + (i - j)] = x;
		}
	}
	
	public static int get(int[] A, int i, int j, int n) {
		if (i >= j) {
			return A[(i - 1) * n - (j - 2)*(j - 1) / 2 + (i - j)];
		}
		return 0;
	}

}

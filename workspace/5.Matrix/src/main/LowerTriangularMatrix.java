package main;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		int[][] M = {{1,0,0},{1,1,0},{1,1,1}};
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + ", ");				
			}
			System.out.println("");
		}
	}
	
	public static void set(int[] A, int i, int j, int x) {
		if (i >= j) {
			A[i * (i - 1) / 2 + (j - 1)] = x;
		}
	}
	
	public static int get(int[] A, int i, int j) {
		if (i >= j) {
			return A[i * (i - 2) / 2 + (j - 1)];
		}
		return 0;
	}

}

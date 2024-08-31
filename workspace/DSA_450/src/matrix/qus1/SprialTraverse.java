package matrix.qus1;

public class SprialTraverse {

	public static void main(String[] args) {
		int r = 4, c = 4;
		int matrix[][] = {{1, 2, 3, 4},
				           {5, 6, 7, 8},
				           {9, 10, 11, 12},
				           {13, 14, 15,16}};
		sprialTraverse(matrix, r, c);
	}
	
	public static void sprialTraverse(int[][] matrix, int r, int c) {
		int i = 0;
		int k = 0;
		int l = 0;
		while (k < r && l < c) {
			for (i = k; i < c; i++) {
				System.out.println(matrix[k][i]);
			}
			k++;
			for (i = k; i < r; i++) {
				System.out.println(matrix[i][c - 1]);
			}
			c--;
			if (k < r) {
				for (i = c - 1; i >=l ; i--) {
					System.out.println(matrix[r - 1][i]);
				}
				r--;
			}
			if (l < c) {
				for (i = r - 1; i >= k; i--) {
					System.out.println(matrix[i][l]);
				}
				l++;
			}
		}
		
	}

}

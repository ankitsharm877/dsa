package example6;

public class Day3 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//wavePrint(matrix);
		sprialPrint(matrix);
//		System.out.println("");
//		System.out.println(power(2, 10));
//		System.out.println(power(2, 5));
	}
	
	public static void wavePrint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ",");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ",");
				}
			}
			System.out.println("");
		}
	}
	
	public static void sprialPrint(int[][] mat) {
		int top = 0;
		int bottom = mat.length - 1;
		int left = 0;
		int right = mat[top].length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (left <= right && top <= bottom) {
			if (count > 0) {
				
			}
		}
	}
	
	
}

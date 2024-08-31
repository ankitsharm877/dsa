package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayOps {

	public static void main(String[] args) {
		int[][] arr = takeInput();
		for (int[] a  : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static int[][] takeInput() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows");
			int rows = sc.nextInt();
			int[][] arr = new int[rows][];
			for (int row = 0; row < rows; row++) {
				System.out.println("Enter the number of cols for row " + row);
				int cols = sc.nextInt();
				arr[row] = new int[cols];
				for (int col = 0; col < cols; col++) {
					System.out.println("Enter the value for row " + row + " column " + col);
					arr[row][col] = sc.nextInt();
				}
			}
			return arr;
		}
	}

}

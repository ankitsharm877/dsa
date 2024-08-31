package example1;

public class Day3 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//wavePrint(matrix);
		spiralPrint(matrix);
		System.out.println(power(2, 0));
		System.out.println(powerI(2, 0));
	}
	
	public static void wavePrint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = arr[i].length - 1; j >=0 ; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.println("");
	}

	public static void spiralPrint(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (top <= bottom && left <= right) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					dir = 2;
					top++;
				}
			}
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					dir = 3;
					right--;
				}
			}
			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					dir = 4;
					bottom--;
				}
			}
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					dir = 1;
					left++;
				}
			}
		}
		System.out.println("");
	}
	
	public static int power(int x, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * x;
		}
		return pow;
	}
	
	public static int powerI(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pnb2 = power(x, n / 2);
		if (n % 2 == 0) {
			return pnb2 * pnb2;
		} else {
			return pnb2 * pnb2 * x;
		}
	}
}

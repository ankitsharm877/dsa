package example2;

public class Day3 {

	public static void main(String[] args) {
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//wavePrint(matrix);
		//sprialPrint(matrix);
//		System.out.println("");
		System.out.println(powerIII(2, 10));
		System.out.println(powerIII(2, 5));
		System.out.println(1 / powerIII(2, 3));
		System.out.println(1 / powerIII(2, 1));
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
		}
	}
	
	public static void sprialPrint(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1;
		int count = (bottom + 1) * (right + 1);
		int dir = 1;
		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ",");
						count--;
					}
					top++;
					dir = 2;
				}
			}
			System.out.println("");
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ",");
						count--;
					}
					right--;
					dir = 3;
				}
			}
			System.out.println("");
			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ",");
						count--;
					}
					bottom--;
					dir = 4;
				}
			}
			System.out.println("");
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ",");
						count--;
					}
					left++;
					dir = 1;
				}
			}
			System.out.println("");
		}
	}
	
	public static int power(int x, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * x;
		}
		return pow;
	}
	
	public static int powerII(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		int pnb2 = powerII(x, n / 2);
		if (n % 2 == 1) {
			return pnb2 * pnb2 * x;
		} else {
			return pnb2 * pnb2;
		}
	}
	
	
	public static double powerIII(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		double pnb2 = powerIII(x, n / 2);
		if (n % 2 == 1) {
			return pnb2 * pnb2 * x;
		} else {
			return pnb2 * pnb2;
		}
	}

}

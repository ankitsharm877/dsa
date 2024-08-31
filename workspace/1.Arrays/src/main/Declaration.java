package main;

public class Declaration {

	public static void main(String[] args) {
		int A[];
		int	B[] = new int[5];
		int C[] = {2,4,6,8,9};
		int D[] = new int[] {2,4};
		
		System.out.println(B[0]);
		System.out.println(B[1]);
		
		
		int[][] a = {{1,2},{3,4},{5,6}};
		int[] b = {1,2,3};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + ", " + a[i]);
		}
		
		int[] arr1 = new int[10];
		Integer[] arr = new Integer[10];
	}

}

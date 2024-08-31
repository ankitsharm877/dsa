package sorting;

public class CountSort {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		countSort(A, A.length - 1);
		display(A);
	}
	
	public static void countSort(int A[], int n) {
		int i, j, max;
		max = max(A, n);
		int count[] = new int[max + 1];
		
		for (i = 0; i < n + 1; i++) {
			count[A[i]]++;
		}
		i = 0; j = 0;
		while (j < max + 1) {
			if (count[j] > 0) {
				A[i++] = j;
				count[j]--;
			} else {
				j++;
			}		
		}
	}
	
	public static int max(int A[], int n) {
		int max = Integer.MIN_VALUE;
		int i;
		for (i = 0; i < n; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}
	
	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}

}

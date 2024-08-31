package main;

public class Heap {
	
	public static void main(String[] args) {
		int a[] = {0, 45, 35, 15, 30, 10, 12, 6, 5, 20, 50};
		insert(a, 10);
		for (int val : a) {
			System.out.println(val);
		}
	}
	
	public static void insert(int a[], int n) {
		int i = n;
		int temp = a[i];
		while (i > 1 && temp > a[i / 2]) {
			a[i] = a[i / 2];
			i = i / 2;
		}
		a[i] = temp;
	}
	
	public static void createHeap(int A[], int n) {
		for (int i=0; i<n; i++){
			insert(A, i);
	    }
	}
	
	public static int delete(int A[], int n) {
		int i, j, val;
		val = A[1];
		A[1] = A[n];
		i = 1;
		j = 2 * i;
		while ( j <= n - 1) {
			if (j < n - 1 && A[j + 1] > A[j] ) {
				j = j + 1;
			}
			if (A[i] < A[j]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i = j;
				j = 2 * j;
			} else {
				break;
			}
		}
		return val;
	}

}

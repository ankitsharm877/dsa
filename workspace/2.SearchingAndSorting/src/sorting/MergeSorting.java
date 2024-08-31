package sorting;

public class MergeSorting {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		mergeSort(A, 0, A.length - 1);
		display(A);
	}

	public static void mergeSort(int A[], int l, int h) {
		int mid;
		if (l < h) {
			mid = (l + h) / 2;
			mergeSort(A, l, mid);
			mergeSort(A, mid + 1, h);
			merge(A, l, mid, h);
		}
	}
	
	public static void merge(int[] A, int l, int mid, int h) {
		int i = l, j = mid +  1, k = l;
		int[] B = new int[A.length];
		while (i <= mid && j <= h) {
			if (A[i] < A[j]) {
				B[k++] = A[i++];
			} else {
				B[k++] = A[j++];
			}
		}
		for (; i <= mid; i++) {
			B[k++] = A[i];
		}
		for (; j<=h; j++) {
			B[k++] = A[j];
		}
		for (i = l; i <= h; i++) {
			A[i] = B[i];
		}
	}
	
	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}

}

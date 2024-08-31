package main;

public class MergeArray {

	public static void main(String[] args) {
		int[] a = {3,8,16,20,25};
		int[] b = {4,10,12,22,23};
		int[] c = mergeArray(a,b);
		for (int i : c) {
			System.out.println(i);
		}
	}
	
	static int[] mergeArray(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		for ( ; i < a.length; i++) {
			c[k++] = a[i++];
		}
		for ( ; j < b.length; j++) {
			c[k++] = b[j++];
		}
		return c;
	}

}

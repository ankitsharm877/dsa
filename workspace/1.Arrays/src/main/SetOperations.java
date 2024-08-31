package main;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,8,16,20,23,25,30};
		int[] b = {4,10,12,22,23,30};
		int[] c = union(a,b);
		for (int i : c) {
			System.out.println(i);
		}
	}
	
	static int[] union(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else if (a[i] > b[j]) {
				c[k++] = b[j++];
			} else {
				c[k++] = a[i++];
				j++;
			}
		}
		for ( ; i < a.length; i++) {
			c[k++] = a[i];
		}
		for ( ; j < b.length; j++) {
			c[k++] = b[j];
		}
		return c;
	}
	
	static int[] intersaction(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[a.length > b.length ? a.length : b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				c[k++] = a[i++];
				j++;
			}
		}
		return c;
	}
	
	static int[] difference(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[a.length > b.length ? a.length : b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else if (a[i] > b[j]) {
				j++;
			} else {
				i++;
				j++;
			}
		}
		for ( ; i < a.length; i++) {
			c[k++] = a[i];
		}
		return c;
	}

}

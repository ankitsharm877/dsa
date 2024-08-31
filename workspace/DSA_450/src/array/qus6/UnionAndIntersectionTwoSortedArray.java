package array.qus6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionTwoSortedArray {

	public static void main(String[] args) {
		int[] a = {85, 25, 1, 32, 54, 6};
		int[] b = {85, 2};
		int m = 6;
		int n = 2;
		System.out.println(Union(a, m, b, n));
		System.out.println(Intersaction(a, m, b, n));

	}

	public static int Union(int[] a, int m, int[] b, int n) {
		Set<Integer> res = new HashSet<>();
		int i = 0, j= 0;
		for (int index = 0; index < (m + n); index++) {
			if (i < m) {
				res.add(a[i++]);
			}
			if (j < n) {
				res.add(b[j++]);
			}
		}
		return res.size();
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
			c[k++] = a[i++];
		}
		for ( ; j < b.length; j++) {
			c[k++] = b[j++];
		}
		return c;
	}
	
	public static int Intersaction(int[] a, int m, int[] b, int n) {
		Set<Integer> res = new HashSet<>();
		List<Integer> out = new ArrayList<>();
		int i = 0, j= 0;
		for (int index = 0; index < (m + n); index++) {
			if (i < m) {
				if (res.contains(a[i])) {
					res.add(a[i]);
					out.add(a[i++]);
				} else {
					out.add(a[i++]);
				}
			}
			if (j < n) {
				if (res.contains(b[j])) {
					res.add(b[j]);
					out.add(b[j++]);
				} else {
					out.add(b[j++]);
				}
			}
		}
		System.out.println(out.toString());
		return out.size();
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
}

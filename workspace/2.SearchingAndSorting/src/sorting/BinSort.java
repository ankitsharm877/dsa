package sorting;

public class BinSort {

	public static void main(String[] args) {
		 int A[] = {2, 5, 8, 12, 3, 6, 7, 10};
		 binSort(A, A.length);
		 display(A);
	}
	
	public static void binSort(int[] A, int n) {
		int max = max(A, n);
		Node[] bins = new Node[max + 1];
		for (int i = 0; i < max + 1; i++) {
			bins[i] = null;
		}
		for (int i = 0; i < n; i++) {
			insert(bins, A[i]);
		}
		
		int i = 0;
		int j = 0;
		while (i < max + 1) {
			while (bins[i] != null) {
				A[j++] = delete(bins, i);
			}
			i++;
		}
		bins = null;
	}
	
	public static void insert(Node[] bins, int idx) {
		Node node = new Node();
		node.value = idx;
		node.next = null;
		
		if (bins[idx] == null) {
			bins[idx] = node;
		} else {
			Node p = bins[idx];
			while (p.next != null) {
				p = p.next;
			}
			p.next = node;
		}
	}
	
	public static int delete(Node[] bins, int idx) {
		Node p = bins[idx];
		bins[idx] = bins[idx].next;
		int x = p.value;
		p = null;
		return x;
	}
	
	public static int max(int[] A, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
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

class Node {
	int value;
	Node next;	
}

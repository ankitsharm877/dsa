package sorting;

public class RadixSort {

	public static void main(String[] args) {
		int A[] = {237, 146, 259, 348, 152, 163, 235, 48, 36, 62};
		radixSort(A, A.length);
		display(A);
	}
	
	public static void radixSort(int[] A, int n) {
		int max = max(A, n);
	    int nPass = countDigits(max);
	 
	    Node[] bins = new Node[10];
        initializeBins(bins, 10);

	    for (int pass=0; pass<nPass; pass++){
	        for (int i=0; i<n; i++){
	            int binIdx = getBinIndex(A[i], pass);
	            insert(bins, A[i], binIdx);
	        }
	        int i = 0;
	        int j = 0;
	        while (i < 10){
	            while (bins[i] != null){
	                A[j++] = delete(bins, i);
	            }
	            i++;
	        }
	        initializeBins(bins, 10);
	    }
	}
	
	public static void initializeBins(Node[] p, int n) {
		for (int i=0; i<n; i++){
	        p[i] = null;
	    }
	}
	
	public static int countDigits(int x){
	    int count = 0;
	    while (x != 0){
	        x = x / 10;
	        count++;
	    }
	    return count;
	}
	
	 
	public static int getBinIndex(int x, int idx){
	    return (int)(x / Math.pow(10, idx)) % 10;
	}
	
	public static void insert(Node[] bins, int value, int idx) {
		Node node = new Node();
		node.value = value;
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

//class Node {
//	int value;
//	Node next;	
//}

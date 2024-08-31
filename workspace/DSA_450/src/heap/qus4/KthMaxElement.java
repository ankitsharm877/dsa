package heap.qus4;

import java.util.PriorityQueue;

public class KthMaxElement {

	public static void main(String[] args) {
		int N = 5, K = 2;
		int Arr[] = {12, 5, 787, 1, 23};
		int[] ans = kLargest(Arr, N, K);
		System.out.println(ans[K - 1]);
	}
	
	public static int[] kLargest(int[] arr, int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
		for (int i = 0; i < n; i++) {
			pq.add(arr[i]);
		}
		int i = 0;
		int[] ans = new int[k];
		while (i < k) {
			ans[i] = pq.remove();
			i++;
		}
		return ans;
    }
	

}

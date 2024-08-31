package heap.qus5;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthMaxMinInUnsortedArray {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15}, K = 3;
		System.out.println(kthMinI(arr, K));
		System.out.println(kthMinII(arr, K));
		System.out.println(kthMinIII(arr, K));
	}
	
	public static int kthMinI(int[] nums, int k) {
		Arrays.sort(nums);
        return nums[k - 1];
	}
	
	public static int kthMinII(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		int i = 0;
        int ans = 0;
		while (i < k) {
			ans = pq.remove();
			i++;
		}
		return ans;
	}
	
	public static int kthMinIII(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			if (pq.size() > k)
                pq.poll();
		}
		return pq.peek();
	}

}

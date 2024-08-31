package heap.qus6;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public static void main(String[] args) {
		int K = 4;
		int arr[][]={{1,2,3,4},{2,2,3,4},
				         {5,5,6,6},{7,8,9,9}};

		mergeKArrays(arr, K);
	}
	
	public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				pq.add(arr[i][j]);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while (!pq.isEmpty()) {
			ans.add(pq.remove());
		}
        return ans;
    }

}

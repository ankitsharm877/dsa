package heap.qus7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Merge2MaxHeaps {

	public static void main(String[] args) {
		int n = 4, m = 3;
		int a[] = {10, 5, 6, 2}, 
				b[] = {12, 7, 9};
		int[] ans = mergeHeaps(a, b, n, m);
		for (int val : ans) {
			System.out.println(val);
		}
	}
	
	public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
		ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : a){
            pq.add(i);
        }
        
        for(int i : b){
            pq.add(i);
        }
        
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        
        return res;
	}

}

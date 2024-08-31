package array.qus24;


import java.util.Map.Entry;
import java.util.TreeMap;

public class LongestConsecutiveSubSequence {

	public static void main(String[] args) {
		int N = 7;
		int a[] = {1,9,3,10,4,20,2};
		System.out.println(findLongestConseqSubseq(a, N));

	}
	
	static int findLongestConseqSubseq(int arr[], int N){
	   TreeMap<Integer, Integer> tm = new TreeMap<>();
	   for (int i = 0; i < N; i++) {
		   tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
	   }
	   Integer last = null;
	   for (Entry<Integer, Integer> entry: tm.entrySet()) {
		   if (last == null) {
			   last = entry.getKey();
		   } else {
			   if ((entry.getKey() - last) != 1) {
				   return last;
			   } else {
				   last = entry.getKey();
			   }
		   }
	   }
	   return last == null ? 0 : last;
	}

}

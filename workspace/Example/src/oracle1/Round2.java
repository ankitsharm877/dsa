package oracle1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] timeIntervals = {
	            {1, 5},
	            {2, 6},
	            {4, 8},
	            {7, 10}
	        };
	        int[] queries = {3, 5, 8, 11};

	        Map<Integer, Integer> result = countQueriesInTimeIntervals(timeIntervals, queries);
	        System.out.println(result);  // Output: {3=2, 5=3, 8=2, 11=0}
	}
	
	 public static Map<Integer, Integer> countQueriesInTimeIntervals(int[][] timeIntervals, int[] queries) {
	        int n = timeIntervals.length;
	        int[] starts = new int[n];
	        int[] ends = new int[n];
	        
	        // Separate and sort start and end times
	        for (int i = 0; i < n; i++) {
	            starts[i] = timeIntervals[i][0];
	            ends[i] = timeIntervals[i][1];
	        }
	        
	        Arrays.sort(starts);
	        Arrays.sort(ends);
	        
	        Map<Integer, Integer> countResults = new HashMap<>();
	        
	        for (int query : queries) {
	            int startCount = binarySearch(starts, query, true);
	            int endCount = binarySearch(ends, query, false);
	            countResults.put(query, startCount - endCount);
	        }
	        
	        return countResults;
	    }
	    
	    // Custom binary search function
	    private static int binarySearch(int[] arr, int target, boolean countStarts) {
	        int low = 0;
	        int high = arr.length - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            if (arr[mid] < target || (countStarts && arr[mid] == target)) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        return low;
	    }
	
	public static List<Integer> getCacheSize(List<List<Integer>> data, List<Integer> queries) {
        // Write your code here
        //5310825 300 = 5311125
        //5311081 101 = 5311182
        //5299871 5239 = 535110
        //5310025 1081 = 5311106
        // List<Integer> ans = new ArrayList<>();
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (List<Integer> subData : data) {
        //     hm.put(subData.get(0), subData.get(0) + subData.get(1));
        // }
        
        // // merge range
        // for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            
        // }
        
        // for (int query : queries) {
        //     int count = 0;
        //     for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        //         if (entry.getKey() <= query && query <= entry.getValue() ) {
        //             count++;
        //         }
        //     }
        //     ans.add(count);
        // }
        // return ans;
        
        List<Integer> ans = new ArrayList<>();
        //System.out.println(data);
        for (int query : queries) {
            int count = 0;
            for (List<Integer> subData : data) {
                if (subData.get(0) <= query && query <= (subData.get(0) + subData.get(1))) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    } 

}

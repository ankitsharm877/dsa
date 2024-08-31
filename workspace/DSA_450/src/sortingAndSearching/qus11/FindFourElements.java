package sortingAndSearching.qus11;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFourElements {

	public static void main(String[] args) {
		int K = 23;
		int A[] = {10,2,3,4,5,7,8};
		System.out.println(fourSum(A, K));
	}
	
	 public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
		 int n = arr.length;
	        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	        Arrays.sort(arr);

	        for (int i = 0; i < n; i++) {
	            if (i > 0 && arr[i] == arr[i - 1]) continue;

	            for (int j = i + 1; j < n; j++) {
	                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

	                int k = j + 1;
	                int l = n - 1;

	                while (k < l) {
	                    long sum = arr[i] + arr[j] + arr[k] + arr[l];

	                    if (sum == target) {
	                        ArrayList<Integer> temp = new ArrayList<>();
	                        temp.add(arr[i]);
	                        temp.add(arr[j]);
	                        temp.add(arr[k]);
	                        temp.add(arr[l]);
	                        ans.add(temp);
	                        k++;
	                        l--;

	                        while (k < l && arr[k] == arr[k - 1]) k++;
	                        while (k < l && arr[l] == arr[l + 1]) l--;
	                    } else if (sum < target) {
	                        k++;
	                    } else {
	                        l--;
	                    }
	                }
	            }
	        }
	        return ans;
	 }

}

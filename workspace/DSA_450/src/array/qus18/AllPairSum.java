package array.qus18;

import java.util.HashMap;

public class AllPairSum {

	public static void main(String[] args) {
		int N = 4, K = 2;
		int arr[] = {1, 1, 1, 1};
		System.out.println(findPairHashing(arr, N, K));
	}
	
	static int getPairsCount(int[] arr, int n, int k) {
		int count =0 ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == k) {
					count++;
				}
			}
		}
		return count;
    }
	
	static int findPairHashing(int[] arr, int n, int k) {
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(map.containsKey(k-num)){
                count+=map.get(k-num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
	}

}

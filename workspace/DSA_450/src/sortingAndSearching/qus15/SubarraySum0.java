package sortingAndSearching.qus15;

public class SubarraySum0 {

	public static void main(String[] args) {
		int n = 6;
		long arr[] = {0,0,5,5,0,0};
		System.out.println(findSubarray(arr, n));
	}
	
	public static long findSubarray(long[] arr ,int n) {
		int count = 0;
        for (int i = 0; i < n; i++) {
        	for (int j = i; j < n; j++) {
        		if ((arr[i] + arr[j]) == 0) {
        			count++;
        		}
        	}
        }
        return count;
    }

}

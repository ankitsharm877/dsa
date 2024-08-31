package array.qus16;

public class CountInversion {

	public static void main(String[] args) {
		int N = 3; 
		long arr[] = {30,20,10};
		System.out.println(inversionCount(arr, N));
	}
	
	static long inversionCount(long arr[], long N) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (arr[i] > arr[j] && i < j) {
					count++;
				}
			}
		}
		return count;
    }

}

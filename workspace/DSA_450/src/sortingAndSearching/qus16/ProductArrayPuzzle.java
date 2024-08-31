package sortingAndSearching.qus16;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int  n = 2;
		int nums[] = {12,0};
		productArray(nums, n);
	}
	
	public static long[] productArray(int nums[], int n) { 
	    long[] output = new long[n];
        long total = 1;
        int j = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                total = (total * nums[i]);   
            } else {
                j = i;
                count++;
            }
        }
        if (count == 0) {
            for (int i = 0; i < n; i++) {
                output[i] = (total / nums[i]);
            }
        } else if (count == 1) {
            output[j] = total;
        }
        return output;
	} 

}

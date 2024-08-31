package capgemini;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		//move all the zeros to end of the array
		int[] arr = {1,3,5,0,6,0,3,0,6,7};  
		moveZeroAtEnd(arr);
	}
	
	public static void moveZeroAtEnd(int[] arr) {
		int n = arr.length; 
        int j = 0; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] != 0) { 
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
                j++; 
            }
            System.out.println(Arrays.toString(arr));
        } 
		
	}
}


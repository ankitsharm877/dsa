package array.qus10;

public class MinJumps {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));

	}
	
	public static int minJumps(int[] arr) {
		if (arr[0] == 0)
			return -1;
		if (arr.length == 1)
			return 0;

		int jumps = 1;
		int maxEndPosition = arr[0]; // 1
		int lastJumpDestination = arr[0]; // 1
 
		for (int i = 0; i < arr.length; i++) {
			if (lastJumpDestination >= arr.length) // 1 >= 11
				return jumps;

			if (i > lastJumpDestination) // 0 > 1
				return -1;

			int currentEndPosition = arr[i] + i; // 1 + 3 = 4

			if (maxEndPosition < currentEndPosition) // 1 <  4
				maxEndPosition = currentEndPosition;

			if (i == lastJumpDestination) { // 0 == 1
				jumps++; // 2
				lastJumpDestination = maxEndPosition; // 1 = 1
			}
		}
		return jumps - 1;
    }

}

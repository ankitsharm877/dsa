package main;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,7,8,9,13,16,19};
		System.out.println(isSorted(arr));
	}
	
	static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}

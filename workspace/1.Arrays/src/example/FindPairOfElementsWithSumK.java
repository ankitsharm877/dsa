package example;

public class FindPairOfElementsWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {6,3,8,10,16,7,5,2,9,14};
//		findPair(arr, 10);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		findPairInSortedArray(arr, 10);
	}
	
	static void findPair(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == k) {
					System.out.println(arr[i] + ", " + arr[j] + ", " + k);
				}
			}
		}
	}
	
//	static void findPairHashing(int[] arr, int k, int l) {
//		int[] H = new int[l];
//		for (int i = 0; i < arr.length; i++) {
//			if (H[(k - arr[i])] != 0) {
//				System.out.println(arr[i] + ", " + (k - arr[i]) + ", " + k);
//			}
//			H[arr[i]]++;
//		}
//	}
	
	static void findPairInSortedArray(int[] a, int k) {
		int i = 0, j = a.length - 1;
		while (i < j) {
			if ((a[i] + a[j]) == k) {
				System.out.println(a[i] + ", " + a[j] + ", " + k);
				j--;
				i++;
			} else if ((a[i] + a[j]) < k) {
				i++;
			} else {
				j--;
			}
		}
	}

}

package example;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,5,6,8,8,8,14,15};
		findDuplicateElementInUnsortedArray(a);

	}
	
	static void findDuplicateElementInSortedArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				int j = i + 1;
				while(a[i] == a[j]) j++;
				System.out.println(a[i] + ", " + (j - i));
				i = j - 1;
			}
		}
	}
	
	static void findDuplicateElementInSortedArrayUsingHashtable(int[] a) {
		int[] H = new int[100];
		for (int i = 0; i < a.length; i++) {
			H[a[i]]++;
		}
		for (int i = 0; i <= 15; i++) {
			if (H[i] > 1) {
				System.out.println(i +", "+ H[i]);
			}
		}
	}
	
	static void findDuplicateElementInUnsortedArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int count = 1;
			if (a[i] != -1) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						a[j] = -1;
					}
				}
				if (count > 1) System.out.println(a[i] + ", " + count);
			}
		}
	}
}

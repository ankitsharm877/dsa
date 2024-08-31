package example;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,8,9,10,14,15};
		//System.out.println(findMissingElementInSortedArrayII(a));
		findMultipleMissingElementI(a);
	}
	
	static int findMissingElementInSortedArrayI(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		int n = a.length + 1;
		int s = (n * (n + 1)) / 2;
		return s - sum;
	}
	
	static int findMissingElementInSortedArrayII(int[] a) {
		int diff = a[0] - 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] - i) != diff) {
				return i + diff;
			}
		}
		return -1;
	}
	
	static void findMultipleMissingElementI(int[] a) {
		int diff = a[0] - 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] - i) != diff) {
				while (diff < (a[i] - i)) {
					System.out.println(diff + i);
					diff++;
				}
			}
		}
	}
	
	static void findMultipleMissingElementII(int[] a, int l, int h) {
		int[] H = new int[h];
		for (int i = 0; i < a.length; i++) {
			H[a[i]]++;
		}
		for (int i = 0; i < H.length; i++) {
			if (H[i] == 0) {
				System.out.println(i);
			}
		}
	}

}

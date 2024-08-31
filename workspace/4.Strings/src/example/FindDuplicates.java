package example;

public class FindDuplicates {

	public static void main(String[] args) {
		String str = "finding";
		findDuplicates(str);
	}
	public static void findDuplicates(String str) {
		int[] H = new int[26];
		for (char c : str.toCharArray()) {
			H[c - 97]++;
		}
		for (int i = 0; i < H.length; i++) {
			if (H[i] > 1) {
				System.out.println((char)(i + 97));
			}
		}
	}
	
	public static boolean findDuplicatesI(String str) {
		int H = 0, x = 0;
		for (char c : str.toCharArray()) {
			x = 1;
			x = x << (c - 97);
			if ((x & H) > 0) {
				return true;
			} else {
				H = x | H;
			}
		}
		return false;
	}

}

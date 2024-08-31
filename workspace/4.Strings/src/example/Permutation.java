package example;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str.toCharArray(), 0, str.length() - 1);
	}
	
	public static void permutation(char[] str, int l, int h) {
		if (l == h) {
			System.out.println(str);
		} else {
			for (int i = l; i <= h; i++) {
				swap(str, l, i);
				permutation(str, l + 1, h);
				swap(str, l, i);
			}
		}
	}

	private static void swap(char[] str, int i, int j) {
		char t = str[i];
		str[i] = str[j];
		str[j] = t;
	}

}

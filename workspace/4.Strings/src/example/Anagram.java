package example;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "decimal";
		String str2 = "medical";
		int[] H = new int[26];
		for (char c : str1.toCharArray()) {
			H[c - 97]++;
		}
		for (char c : str2.toCharArray()) {
			H[c - 97]--;
			if (H[c - 97] < 0) {
				System.out.println("Not anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}

}

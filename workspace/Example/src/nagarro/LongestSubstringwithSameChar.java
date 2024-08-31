package nagarro;

public class LongestSubstringwithSameChar {

	public static void main(String[] args) {
		String s = "abcdddddeff";
		int ans = 1;
		int temp = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				temp++;
			} else {
				ans = Math.max(ans, temp);
				temp = 1;
			}
		}
		System.out.println(ans);
	}

}

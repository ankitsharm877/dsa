package string.qus8;

public class LongestPalindrome {

	public static void main(String[] args) {
		String S = "aaaabbaa";
		longestPalin(S);
	}
	
	static String longestPalin(String S){
        String str = "";
		for (int i = 0; i < S.length(); i++) {
			int m = i;
			int n = S.length() - 1;
			boolean flag = true;
			while (m < n) {
				if (S.charAt(m) != S.charAt(n)) {
					flag = false;
					break;
				}
				m++;
				n--;
			}
			if (flag) {				
				str = S.substring(i);
				return str;
			}
		}
		return S.charAt(0) + "";
        
    }

}

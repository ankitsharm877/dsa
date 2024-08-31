package core;

public class ComparingStringAndCheckingPalindrome {

	public static void main(String[] args) {
		String str1 = "Painter";
		String str2 = "Painter";
		System.out.println(compare(str1, str2));
		
		String str = "madam";
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		String revStr = reverse(str);
		return compare(str, revStr);
	}
	
	public static String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	public static boolean compare(String str1, String str2) {
		for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}

package string.qus2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "abba";
		System.out.println(isPalindrome(str));
	}
	
	public static int isPalindrome(String S) {
		int i = 0;
		int j = S.length() - 1;
		while (i < j) {
		   if (S.charAt(i) != S.charAt(j)) {
			   return 0;
		   }
		   i++;
		   j--;
		}
		return 1;
	}

}

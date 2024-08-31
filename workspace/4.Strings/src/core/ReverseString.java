package core;

public class ReverseString {

	public static void main(String[] args) {
		String str = "python";
		reverseII(str);
	}
	
	public static void reverseI(String str) {
		String ans = "";
		for (char c: str.toCharArray()) {
			ans = c + ans;
		}
		System.out.println(ans);
	}
	
	public static void reverseII(String str) {
		char[] s = str.toCharArray();
		for (int i = 0, j = s.length - 1; i < j;i++, j--) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
		}
		System.out.println(String.valueOf(s));
	}
	
	public static void reverseIII(String str) {
		System.out.println(new StringBuffer(str).reverse());
	}

}

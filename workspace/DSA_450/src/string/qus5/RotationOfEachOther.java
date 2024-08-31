package string.qus5;

public class RotationOfEachOther {

	public static void main(String[] args) {
		String S1 = "ABCD", S2 = "ACBD";
		System.out.println(rotation(S1, S2));
	}
	
	public static String rotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return "Strings are not rotations of each other";
		}
		for (int i = 0; i < s2.length(); i++) {
			if (s1.equals(s2)) {
				return "Strings are rotations of each other";
			} else {
				s2 = s2.substring(1) + s2.charAt(0);
			}
		}
		return "Strings are not rotations of each other";
	}

}

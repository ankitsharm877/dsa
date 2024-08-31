package contest132;

public class Question1 {

	public static void main(String[] args) {
		String s = "a1cb";
		StringBuilder sb  = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}

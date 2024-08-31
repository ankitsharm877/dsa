package string.qus10;

import java.util.HashSet;

public class PrintAllSubsequences {

	public static void main(String[] args) {
		String str = "abc";
		subsequence(str);
		System.out.println(st);
	}

	static HashSet<String> st = new HashSet<>();

	static void subsequence(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length(); j > i; j--) {
				String sub_str = str.substring(i, j);

				if (!st.contains(sub_str))
					st.add(sub_str);

				for (int k = 1; k < sub_str.length() - 1; k++) {
					StringBuffer sb = new StringBuffer(sub_str);

					sb.deleteCharAt(k);
					if (!st.contains(sb))
					subsequence(sb.toString());
				}
			}
		}
	}

}

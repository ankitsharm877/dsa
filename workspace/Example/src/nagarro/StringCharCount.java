package nagarro;

import java.util.Map;
import java.util.TreeMap;

public class StringCharCount {

	public static void main(String[] args) {
		// If aaahhcccddaah is given, then print - a5c3d2h3
		String s = "aaahhcccddaah";
		count(s);
	}
	
	public static void count(String s) {
		TreeMap<Character, Integer> hm = new TreeMap<>();
		for (int i = 0; i < s.length(); i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
		}
		String ans = "";
		for (Map.Entry<Character, Integer> entry: hm.entrySet()) {
			ans += entry.getKey() + "" + entry.getValue();
		}
		System.out.println(ans);
	}

}

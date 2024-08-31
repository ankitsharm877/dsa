package string.qus3;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicateChars {

	public static void main(String[] args) {
		String S = "geeksforgeeks";
		printDuplicate(S);
	}
	
	public static void printDuplicate(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (Entry<Character, Integer> entry: hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ", " + entry.getValue());
			}
		}
	}

}

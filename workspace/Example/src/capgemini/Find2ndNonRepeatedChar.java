package capgemini;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find2ndNonRepeatedChar {

	public static void main(String[] args) {
		//print the second non repeated character
		String str ="helloword"; // h, e
		System.out.println(findSecondNonRepeatedCharacter(str));
	}
	
	public static Character findSecondNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (char c: str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		int k = 2;
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				k--;
				if (k == 0) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

}

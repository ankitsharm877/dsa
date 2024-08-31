package applications;

import java.util.HashMap;
import java.util.Map;

public class GetMaxFreqCharacter {

	public static void main(String[] args) {
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreqCharacter(str));
	}
	
	public static Character getMaxFreqCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
		int max = 0;
		char maxChar = '\0';
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		return maxChar;
	}

}

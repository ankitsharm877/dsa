package epam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedNumber {

	public static void main(String[] args) {
		String input = "Welcome to EPAM Company";
		findNumber(input);
	}
	
	public static void findNumber(String input) {
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (char c : input.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		System.out.println(hm);
		Optional<Map.Entry<Character, Integer>> optionalEntry = hm.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
		if (optionalEntry.isPresent()) {
			System.out.println(optionalEntry.get().getKey());
		}
	}

}

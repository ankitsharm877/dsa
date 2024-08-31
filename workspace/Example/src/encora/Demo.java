package encora;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// stream : to find the 1st non repeated char
		String str = "adidas"; // b
		//Arrays.asList(str.toCharArray()).stream().collect(Collectors.groupingBy(Character::new),Collectors.toList());
		Character result = str.chars()
			.mapToObj(i -> Character.toLowerCase(Character.valueOf((char)i)))
			.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
			.entrySet().stream()
			.filter(entry -> entry.getValue() == 1L)
			.map(entry -> entry.getKey())
			.findFirst().get();
		System.out.println(result);
			
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		// n + 1 problem in hibernate
		// save() vs persist()
		// lazy loading vs eager
		//
	}
}


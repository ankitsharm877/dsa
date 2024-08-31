package feuji;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Alice", 30);
		map.put("Charlie", 35);
		map.put("Bob", 25);
		map.put("Eve", 22);
		map.put("David", 28);
		
		List<Entry<String, Integer>> collect = map.entrySet()
				.stream().sorted((a, b) -> a.getKey().compareTo(b.getKey()))
				.collect(Collectors.toList());
		//System.out.println(collect);
		
		String word = "change this to camel case";
		//output: - changeThisToCamelCase
		
		String res = "";
		char prev = '\0';
		for (char ch : word.toCharArray()) {
			if (ch != ' ') {
				if (prev == ' ') {
					res += (char)(ch - 32);
				} else {
					res += ch;
				}
			}
			prev = ch;
		}
		//System.out.println(res);
		
		String[] list = {"ram","ankit", "raj"};
		
		Arrays.asList(list).sort((a, b) -> a.length() - b.length());
		
		System.out.println(Arrays.toString(list));
	}
}

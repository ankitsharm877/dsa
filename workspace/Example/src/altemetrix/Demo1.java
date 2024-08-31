package altemetrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sharma","ankit","sharma","nirmal","nirmal");
		
		// count of string
		// sorting of key 
		
		HashMap<String, Integer> hm = new LinkedHashMap<>();
		
		for (String str : list) {
			hm.put(str, hm.getOrDefault(str, 0) + 1);
		}
		System.out.println(hm);
		List<Entry<String, Integer>> list2 = hm.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey())).toList();
		System.out.println(list2);
	}

}

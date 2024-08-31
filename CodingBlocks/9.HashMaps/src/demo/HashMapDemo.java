package demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
		
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("USA", 200);
		hm.put("UK", 175);
		hm.put("India", 300);
		hm.put("China", 350);
		System.out.println(hm);
		
		hm.put("Sweden", 100);
		System.out.println(hm);
		
		hm.put("India", 325);
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		System.out.println(hm.get("RSA"));
		System.out.println(hm.getOrDefault("RSA", 0));
		
		System.out.println(hm.remove("USA"));
		System.out.println(hm);
		
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("USA"));
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = hm.values();
		System.out.println(values);
		
		Set<Map.Entry<String, Integer>> entries = hm.entrySet();
		System.out.println(entries);
	}
}

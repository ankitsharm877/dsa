package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		map.put(1, 1);
		map.putAll(map1);
		map.get(1);
		map.remove(1);
		map.containsKey(1);
		map.containsValue(1);
		map.size();
		map.isEmpty();
		map.clear();
		
		map.getOrDefault(1, 0);
		map.putIfAbsent(1, 1);
		
		Set<Integer> set = map.keySet();
		Collection<Integer> values = map.values();
		Set<Entry<Integer, Integer>> entries = map.entrySet();
		
		Map<Integer, Integer> map2 = Collections.synchronizedMap(map1);
		
		Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
		entry.setValue(1);
		entry.getKey();
		entry.getValue();
	}

}

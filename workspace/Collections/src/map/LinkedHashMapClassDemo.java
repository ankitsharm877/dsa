package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClassDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		lhm.put(1, 1);
		lhm.get(1);
		lhm.containsKey(1);
		lhm.containsValue(1);
		for (Map.Entry<Integer, Integer> entry : lhm.entrySet()) {
			System.out.println(entry.getKey() + ", " +  entry.getValue());
		}
	}

}

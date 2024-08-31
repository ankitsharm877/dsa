package map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfaceDemo {

	public static void main(String[] args) {
		SortedMap<Integer, Integer> sm = new TreeMap<>();
		sm.put(2, 1);
		sm.put(1, 1);
		System.out.println(sm);
		
		sm.firstKey();
		sm.lastKey();
		sm.headMap(1);
		sm.tailMap(1);
		sm.subMap(1, 3);
		Comparator<? super Integer> com  = sm.comparator();
		
		
	}

}

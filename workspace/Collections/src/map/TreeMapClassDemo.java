package map;

import java.util.TreeMap;

public class TreeMapClassDemo {

	public static void main(String[] args) {
		//A Red-Black tree based implementation.
		//NavigableMap<K,V>, Cloneable, java.io.Serializable
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(1, 1);
		tm.put(5, 2);
		tm.put(2, 1);
		System.out.println(tm);
	}

}

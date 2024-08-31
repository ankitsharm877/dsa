package map;

import java.util.HashMap;

public class HashMapClassDemo {

	public static void main(String[] args) {
		//Map<K,V>, Cloneable, Serializable
		HashMap<Integer, Integer> hm = new HashMap<>();
		HashMap<Integer, Integer> hm1 = new HashMap<>(10);
		HashMap<Integer, Integer> hm2 = new HashMap<>(hm1);
		
		hm.put(1, 1);
		hm.put(2, 2);
		System.out.println(hm);
		
		hm1.put(new Integer(10), 1);
		hm1.put(new Integer(10), 2);
		System.out.println(hm1);

	}

}

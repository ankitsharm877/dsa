package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<>();
		chm.put(1, 1);
		chm.put(2, 2);
		System.out.println(chm);
		System.out.println(chm.get(2));
	}

}

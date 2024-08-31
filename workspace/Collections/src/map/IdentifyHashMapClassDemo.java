package map;

import java.util.IdentityHashMap;

public class IdentifyHashMapClassDemo {

	public static void main(String[] args) {
		// incase of duplicate key it check using == not equal() method.
		IdentityHashMap<Integer, Integer> ihm = new IdentityHashMap<>();
		ihm.put(new Integer(10), 1);
		ihm.put(new Integer(10), 2);
		System.out.println(ihm);
	}

}

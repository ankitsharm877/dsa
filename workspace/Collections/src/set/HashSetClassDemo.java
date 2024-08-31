package set;

import java.util.HashSet;

public class HashSetClassDemo {

	public static void main(String[] args) {
		//Set<E>, Cloneable, java.io.Serializable
		//Using HashMap to store data as key
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>(10);
		HashSet<Integer> hs2 = new HashSet<>(hs);
		HashSet<Integer> hs3 = new HashSet<>(10, 2);
		
		hs.add(1);
		hs.add(3);
		hs.add(-10);
		hs.add(2);
		System.out.println(hs);
	}

}

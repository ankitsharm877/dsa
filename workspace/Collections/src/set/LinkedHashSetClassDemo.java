package set;

import java.util.LinkedHashSet;

public class LinkedHashSetClassDemo {

	public static void main(String[] args) {
		//Set, Cloneable, Serializable
		//Using HashMap to store data as key
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(3);
		System.out.println(lhs);
	}

}

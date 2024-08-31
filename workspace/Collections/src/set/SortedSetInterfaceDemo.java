package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceDemo {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		SortedSet<Integer> ss1 = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
		ss.add(1);
		ss.add(20);
		ss.add(3);
		ss.add(5);
		System.out.println(ss);
		
		ss.first();
		ss.last();
		ss.headSet(3);
		ss.tailSet(3);
		ss.subSet(3, 5);
		ss.comparator();
	}

}

package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceDemo {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.first();
		ns.last();
		ns.ceiling(1);
		ns.floor(1);
		ns.higher(1);
		ns.lower(1);
	}

}

package set;

import java.util.TreeSet;

public class TreeSetClassDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		TreeSet<Integer> ts1 = new TreeSet<>((a,b) -> a.compareTo(b));
		TreeSet<Integer> ts2 = new TreeSet<>(ts);
		ts.add(1);
		ts.add(4);
		ts.add(2);
		System.out.println(ts);
		
	}

}

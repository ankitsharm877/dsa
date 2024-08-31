package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.addAll(List.of(2));
		set.remove(1);
		set.removeAll(List.of(2));
		set.retainAll(List.of(1)); // remove all element other than 2
		
		set.clear();
		set.isEmpty();
		set.size();
		set.contains(1);
		set.containsAll(List.of(1));
		
		Object[] arr = set.toArray();
		System.out.println(arr[0]);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
	}

}

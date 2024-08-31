package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionInterface {

	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();
		list.add(1);
		list.addAll(List.of(2));
		list.remove(1);
		list.removeAll(List.of(2));
		list.retainAll(List.of(1)); // remove all element other than 2
		
		list.clear();
		list.isEmpty();
		list.size();
		list.contains(1);
		list.containsAll(List.of(1));
		
		Object[] arr = list.toArray();
		System.out.println(arr[0]);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
	}
	

}

package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0, 1);
		list.addAll(1, List.of(2));
		list.remove(0);
		list.get(0);
		list.set(0, 3);
		list.indexOf(1);
		list.lastIndexOf(1);
		ListIterator<Integer> lItr =  list.listIterator();
		while (lItr.hasNext()) {
			lItr.next();
			lItr.nextIndex();
			lItr.add(1);
			lItr.remove();
			lItr.set(1);
		}
		while (lItr.hasPrevious()) {
			lItr.previous();
			lItr.previousIndex();
		}
	}

}

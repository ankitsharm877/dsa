package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//implements List, Deque, Cloneable, Serializable
		LinkedList<Integer> doublell = new LinkedList<>();
		LinkedList<Integer> dll1 = new LinkedList<>(doublell);
		
		doublell.addFirst(1);
		doublell.addLast(2);
		doublell.removeFirst();
		doublell.removeLast();
		doublell.getFirst();
		doublell.getLast();
		
		
		LinkedList<Integer> cloneAl = (LinkedList<Integer>) doublell.clone();
		System.out.println(cloneAl);
		
		List<Integer> l1 = Collections.synchronizedList(doublell);
		

	}

}

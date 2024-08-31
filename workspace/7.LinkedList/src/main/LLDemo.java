package main;



public class LLDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(5);
		list.addLast(7);
		list.addLast(9);
		list.addLast(10);
		list.addLast(15);
		//list.add(4, 1);
		list.addInSortedList(1);
		//list.display(list.head);
		list.display();
		//list.displayR(list.head);
		System.out.println("Count: " + list.count());
		System.out.println("Count: " + list.count(list.head));
		System.out.println("Sum: " + list.sum());
		System.out.println("Sum: " + list.sum(list.head));
		System.out.println("Max: " + list.max());
		System.out.println("Max: " + list.max(list.head));
		System.out.println("Linear search for key: 10, " + list.linearSearch(10));
		System.out.println("Linear search for key: 7, " + list.linearSearch(list.head, 7));
		//System.out.println("Linear search for key: 7, " + list.linearSearchMoveToHead(7));
		System.out.println("Remove: " + list.removeFirst());
		list.display();
		//System.out.println("Remove: " + list.removeLast());
		//list.display();
		//System.out.println("Remove: " + list.remove(6));
		//list.display();
		list.removeDuplicatesInSortedList();
		list.display();
		list.reverse(null, list.head);
		list.display();
		System.out.println("Is Loop: " + list.isLoop());
		System.out.println("Middle: " + list.middle());

	}

}

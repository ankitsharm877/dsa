package Deque;

import java.util.ArrayDeque;

public class ArrayDequeClassInterface {

	public static void main(String[] args) {
		// Resizable-array implementation of the Deque interface
		// Deque<E>, Cloneable, Serializable
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(1);
		ad.addLast(2);
		ad.getFirst();
		ad.getLast();
		ad.removeFirst();
		ad.removeLast();
	}

}

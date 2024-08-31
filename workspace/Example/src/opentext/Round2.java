package opentext;

import java.util.HashMap;

public class Round2 {

	public static void main(String[] args) {
		// arr1-> int, arr2 -> int
		//arr1 is subset or arr2
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3,4,5};
		System.out.println(isSubset(arr1, arr2));
		
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(1);
		ll.head.next = new LinkedList.Node(2);
		ll.head.next.next = new LinkedList.Node(3);
		ll.display();
		ll.head = ll.reverseI(ll.head);
		ll.display();
		
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.display();
		al.add(3);
		al.display();
		
		
		//spend memory
		// get interest from stock
		
		// every day 100
//		 -> deposit(int amount, int accountId)  {
//			 // payment gateway
//		 }
//		
//		// if interest 10 % then sell stock
//		 // buy amount 
//		 --> scheduler every mints check stock price
//		 -> >= 10 % then withdraw()
		 
		
	}
	
	public static boolean isSubset(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int val : arr1) {
			hm.put(val, 1);
		}
		
		for (int val : arr2) {
			if (hm.containsKey(val)) {
				hm.remove(val);
			}
		}
		return hm.isEmpty();
	}
}

class LinkedList {
	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
		}
	}
	
	Node head;
	
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node aHead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = aHead;
		}
		this.head = prev;
	}
	
	public Node reverseI(Node head) {
		if (head.next == null) {
			return head;
		}
		Node rest = reverseI(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}
}


class Singleton {
	private static Singleton instance;
	
	private Singleton () {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

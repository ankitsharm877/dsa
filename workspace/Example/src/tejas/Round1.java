package tejas;

public class Round1 {

	public static void main(String[] args) {
		String[] arr =  {"aba", "abcd", "abrd", "abty"};
		System.out.println(commonPrefix(arr));
	}
	
	public static String commonPrefix(String[] arr) {
		String str = arr[0];
		//System.out.println(str);
		for (int i = 0; i < str.length(); i++) { 
			str = str.substring(0, i); // aba, ab
			int count = 0;
			for (int j = 1; j < arr.length; j++) { // O (N)
				if (arr[j].startsWith(str)) {
					count++;
				}
			}
			if (count == arr.length - 1) {
				return str;
			}
		}
		return "";
	}
}


class Queue {
	LinkedList list;
	
	Queue() {
		list = new LinkedList();
	}
	
	void enqueue(int val) {
		this.list.addLast(val);
	}
	
	int dequeue() {
		return this.list.removeFirst();
	}
	
}

class LinkedList {
	 
	class Node {
		int val;
		Node next;
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public LinkedList() {
		
	}
	
	public void addLast(int val) {
		Node node = new Node(val);
		if (this.head == null) {
			this.head =  node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}
	
	public int removeFirst() {
		Node temp = this.head;
		this.head = this.head.next;
		return temp.val;
	}
}



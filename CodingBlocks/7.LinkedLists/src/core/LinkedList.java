package core;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	// O(n)
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	// O(1)
	public void addLast(int item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//attach
		if (this.size >= 1) {
			this.tail.next = nn;
		}
		
		//summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}
	
	// O(1)
	public void addFirst(int item) {
		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		// attach
		if (this.size >= 1) { 
			nn.next = head;
		}
		
		//summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}
	
	// O(n)
	public void addAt(int item, int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index.");
		}
		if (index == 0) {
			addFirst(item);
		} else if (index == this.size - 1) {
			addLast(item);
		} else {
			Node nn = getNodeAt(index - 1);
			Node n = new Node();
			n.data = item;
			Node np1 = nn.next;
			n.next = np1;
			nn.next = n;
			this.size++;
		}
	}
	
	public int getAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index.");
		}
		
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index.");
		}
		
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	// O(1)
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}
	
	// O(1)
	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.tail.data;
	}
	
	// O(1)
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}
	
	// O(n)
	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node temp = getNodeAt(this.size - 2);
			this.tail = temp;
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}
	
	// O(n)
	public int removeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index.");
		}
		
		if (index == 0) {
			return removeFirst();
		} else if (index == this.size - 1) {
			return removeLast();
		} else {
			Node nn = getNodeAt(index - 1);
			Node n = nn.next;
			Node np1 = n.next;
			nn.next = np1;
			this.size--;
			return n.data;
		}
	}
	
	public void reverseLLData() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}
	
	public void reverseLL() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		
		// swap
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
	}
	
	public int middle() {
		Node slow = this.head;
		Node fast = this.head;
		
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}

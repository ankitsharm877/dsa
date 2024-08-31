package main;

public class Chaining {

	public static void main(String[] args) {
		Node[] hashtable = new Node[10];
		for (int i = 0; i < 10; i++) {
			hashtable[i] = null;
		}
		insert(hashtable, 12);
		insert(hashtable, 22);
		insert(hashtable, 31);
		System.out.println(searchInSortedList(hashtable[hash(12)], 12));
		System.out.println(searchInSortedList(hashtable[hash(22)], 22));
		System.out.println(searchInSortedList(hashtable[hash(2)], 2));
	}
	
	public static int hash(int key) {
		return key % 10;
	}
	
	public static void insert(Node[] hashTable, int key) {
		int index = hash(key);
		hashTable[index] = addInSortedList(hashTable[index], key);
	}
	
	public static class Node {
		int data;
		Node next;

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	
	public static Node addInSortedList(Node head, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node temp1 = head;
		if (temp1 == null) {
			head = node;
		} else {
			Node temp2 = null;
			while (temp1 != null && temp1.data < data) {
				temp2 = temp1;
				temp1 = temp1.next;
			}
			if (temp1 == head) {
				node.next = temp1;
				head = node;
			} else {
				node.next = temp1;
				temp2.next = node;
			}
		}
		return head;
	}
	
	public static int searchInSortedList(Node head, int key) {
		Node p = head;
		while (p != null) {
			if (p.data == key) {
				return key;
			}
			p = p.next;
		}
		return -1;
	}

}

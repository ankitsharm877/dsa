package sap1.sap2;

public class ReverseLinkedList {
	public static void main(String[] args) {
		// create ll and reverse 
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		display(root);
		root = reverse(root);
		display(root);
	}
	
	public static void display(Node root) {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public static Node reverse(Node root) {
		Node temp = root;
		Node temp2 = null;
		while (temp != null) {
			Node t = temp.next;  
			temp.next = temp2;
			temp2 = temp;
			temp = t;
		} 
		root = temp2;
		return root;
	}
}

class Node {
	int data;
	Node next;
	
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
}

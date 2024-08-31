package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;
		Node (int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	Node root = null;
	int size = 0;
	
	public BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}
	
	private Node takeInput(Scanner s, Node parent, boolean isLeft) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else {
			
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;
		
		boolean choice = false;
		System.out.println("Do you have left child of " + node.data);
		choice = s.nextBoolean();
		
		if (choice) {
			node.left = takeInput(s, node, true);
		}
		
		choice = false;
		System.out.println("Do you have right child of " + node.data);
		choice = s.nextBoolean();
		
		if (choice) {
			node.left = takeInput(s, node, false);
		}
		return node;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	private void display(Node node) {
		String str = "";
		if (node.left != null) {
			str = str + node.left.data + "=>";
		} else {
			str = str + "END=>";
		}
		System.out.println(str);
	}
	
	public int height() {
		return this.height(this.root);
	}
	
	private int height(Node root) {
		if (root == null) {
			return -1;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		int height = Math.max(lh, rh) + 1;
		return height;
	}
	
	public void preOrder() {
		this.preOrder(this.root);
	}
	
	private void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data + ", ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder() {
		this.inOrder(this.root);
	}
	
	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data + ", ");
			inOrder(root.right);
		}
	}
	
	public void inorderIterative() {
		this.inorderIterative(this.root);
	}
	
	private ArrayList<Integer> inorderIterative(Node node) {
		ArrayList<Integer> list = new ArrayList<>();
		if (node == null) {
			return list;
		}
		Stack<Node> stack = new Stack<>();
		
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				list.add(node.data);
				node = node.right;
			}
		}
		return list;
	}
	
	public void postOrder() {
		this.postOrder(this.root);
	}
	
	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data + ", ");
		}
	}
	
	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node node = queue.removeFirst();
			System.out.println(node.data + ", ");
			if (node.left != null) {
				queue.addLast(node.left);
			}
			if (node.right != null) {
				queue.addLast(node.right);
			}
		}
	}
	
	public int sumLeaf(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.data;
		}
		return sumLeaf(root.left) + sumLeaf(root.right);
	}
	
	//O(2^n)
	public int diameter(Node node) {
		if (node == null) {
			return 0;
		}
		// when diameter passes through the root
		int case1 = this.height(node.left) + this.height(node.right) + 2;
		// when diameter in left sub tree
		int case2 = this.diameter(node.left);
		// when diameter in right sub tree
		int case3 = this.diameter(node.right);
		// max of all three case
		return Math.max(case1, Math.max(case2, case3));
	}
	
	// O(n)
	public DiaPair diameterI(Node node) {
		DiaPair lp = this.diameterI(node.left);
		DiaPair rp = this.diameterI(node.right);
		
		DiaPair mp = new DiaPair();
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.diameter = Math.max(lp.height + rp.height + 2, Math.max(lp.diameter, rp.diameter));
		return mp;
	}
	
	public class DiaPair {
		int height;
		int diameter;
		public DiaPair() {
			
		}
		public DiaPair(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}
	
	
}

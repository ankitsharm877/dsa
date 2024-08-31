package main;

import java.util.Stack;

public class BST {
	
	Node root;
	
	public class Node {
		Node left;
		int data;
		Node right;
		public Node (int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void insert(int key) {
		Node t = root;
		Node r = root, p;
		if (root == null) {
			p = new Node(key);
			root = p;
			return;
		}
		while (t != null) {
			r = t;
			if (key < t.data) {
				t = t.left;
			} else if (key > t.data) {
				t = t.right;
			} else {
				return;
			}
		}
		p = new Node(key);
		if (key < r.data) r.left = p;
		else r.right = p;
	}
	
	public Node insert(Node root, int key) {
		if (root == null) {
			Node p = new Node(key);
			return p;
		}
		if (key < root.data) {
			root.left = insert(root.left, key);
		} else if (key > root.data) {
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	public Node delete(Node root, int key) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			if (root == this.root) {
				this.root = null;
			}
			return null;
		}
		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {
			if (height(root.left) > height(root.right)) {
				Node q = inorderPre(root.left);
				root.data = q.data;
				root.left = delete(root.left, q.data);
			} else {
				Node q = inorderSucc(root.right);
				root.data = q.data;
				root.right = delete(root.right, q.data);
			}
		}
		return root;
	}
	
	public int height(Node node) {
		int x = 0, y = 0;
		if (node == null) {
			return 0;
		}
		x = height(node.left);
		y = height(node.right);
		return x > y ? x + 1 : y + 1;
	}
	
	public Node inorderPre(Node root) {
		while (root != null && root.right != null) {
			root = root.right;
		}
		return root;
	}
	
	public Node inorderSucc(Node root) {
		while (root != null && root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public Node search(Node root, int key) {
		while(root != null) {
			if (root.data == key) {
				return root;
			} else if (key < root.data) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		return null;
	}
	
	public Node searchR(Node root, int key) {
		if (root == null) {
			return null;
		} else if (key == root.data) {
			return root;
		} else if (key < root.data) {
			return searchR(root.left, key);
		} else {
			return searchR(root.right, key);
		}
	}
	
	public void generateFromPreOrder(int pre[], int n) {
		Stack<Node> stack = new Stack<>();
		Node t;
		int i = 0;
		root = new Node(pre[i++]);
		root.left = root.right = null;
		Node p = root;
		while (i < n) {
			if (pre[i] < p.data) {
				t = new Node(pre[i++]);
				p.left = t;
				stack.push(p);
				p = t;
			} else {
				if (pre[i] > p.data && ((!stack.isEmpty() && pre[i] < stack.peek().data) || stack.isEmpty())) {
					t = new Node(pre[i++]);
					p.right = t;
					p = t;
				} else {
					p = stack.pop();
				}
			}
		}
	}

}

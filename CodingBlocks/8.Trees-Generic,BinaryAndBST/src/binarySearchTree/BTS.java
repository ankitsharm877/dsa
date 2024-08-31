package binarySearchTree;

public class BTS {
	
	private class Node {
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BTS (int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}
	
	private Node construct(int[] arr, int lo, int hi) {
		// base case
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		
		Node nn = new Node();
		nn.data = arr[mid];
		
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		
		return nn;
	}
	
	public void display() {
		this.display(this.root);
	}
	
	public void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		
		str += " -> " + node.data + " <- ";
		
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}
		System.out.println(str);
		
		display(node.left);
		display(node.right);
	}
	
	public void inorder() {
		this.inorder(this.root);
	}
	
	private void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + ", ");
			inorder(node.right);
		}
	}
	
	public boolean find(int item) {
		return this.find(this.root, item);
	}
	
	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}
	
	public int max() {
		return this.max(this.root);
	}
	
	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}
	
	public void add(int item) {
		this.add(this.root, item);
	}
	
	private void add(Node node, int item) {
		if (item > node.data) {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}
		} else {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;
			} else {
				add(node.left, item);
			}
		}
	}
	
	public void remove(int item) {
		this.remove(this.root, null, false, item);
	}
	
	private void remove(Node node, Node parent, boolean ilc, int item) {
		if (item > node.data) {
			remove(node.right, node, false, item);
		} else if (item < node.data) {
			remove(node.left, node, true, item);
		} else {
			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left == null && node.right != null) {
				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.left != null && node.right == null) {
				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else {
				int max = max(node.left);
				node.data = max;
				remove(node.left, node, true, max);
			}
		}
	}
	
	public boolean isBST() {
		return this.isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);	
	}
	
	public boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data >= max || node.data <= min) {
			return false;
		} else if (!this.isBST(node.left, min, node.data)) {
			return false;
		} else if (!this.isBST(node.right, node.data, max)) {
			return false;
		}
		return true;
	}
}

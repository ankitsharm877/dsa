package bst.qus1;

import trees.Node;

public class SeachInBST {

	public Node search(Node root, int x) {
		if (root == null) {
			return null;
		}
		if (root.data > x) {
			search(root.left, x);
		} else if (root.data < x) {
			search(root.right, x);
		} else if (root.data == x) {
			return root;
		}
		return null;
	}
}

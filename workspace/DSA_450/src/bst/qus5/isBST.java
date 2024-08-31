package bst.qus5;

import trees.Node;

public class isBST {

	Node prev = null;
	boolean flag = true;

	void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		if (prev == null)
			prev = root;
		else if (prev.data >= root.data)
			flag = false;
		else
			prev = root;
		inorder(root.right);
	}

	boolean isBST(Node root) {
		inorder(root);
		return flag;
	}
	
	public boolean isValidBST(Node root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBST(Node root, long minVal, long maxVal) {
		if (root == null)
			return true;

		if (root.data >= maxVal || root.data <= minVal)
			return false;

		return isValidBST(root.left, minVal, root.data) && isValidBST(root.right, root.data, maxVal);
	}
}

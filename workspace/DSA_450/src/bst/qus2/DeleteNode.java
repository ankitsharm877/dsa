package bst.qus2;

import trees.Node;

public class DeleteNode {
	
	Node node = null;
    public Node deleteNode(Node root, int key) {
        node = root;
        return delete(root, key);
    }
    public Node delete(Node root, int key) {
        if (root == null) {
			return null;
		}
		if (key == root.data && root.left == null && root.right == null) {
            if (node == root) {
                node = null;
            }
			return null;
		}
		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else if (key == root.data) {
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

    public int height(Node root) {
		int x = 0, y = 0;
		if (root == null) {
			return 0;
		}
		x = height(root.left);
		y = height(root.right);
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
}

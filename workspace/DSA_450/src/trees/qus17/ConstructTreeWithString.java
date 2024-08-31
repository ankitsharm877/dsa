package trees.qus17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import trees.Node;

public class ConstructTreeWithString {
	
	public static void main(String[] args) {
		String str = "4(2(3)(1))(6(5))";
		Node root = constructTree(str, 0, str.length() - 1);
		inorder(root);
	}

	static Node constructTree(String str, int start, int end) {
		
		return null;
	}
	
	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}

}

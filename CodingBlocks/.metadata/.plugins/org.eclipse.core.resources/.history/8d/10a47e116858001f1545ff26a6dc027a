package example5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Day10 {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new BinaryTree.Node(1);
		bt.root.left = new BinaryTree.Node(2);
		bt.root.right = new BinaryTree.Node(3);
		bt.preorder(bt.root);
		System.out.println("");
		bt.inorder(bt.root);
		System.out.println("");
		bt.postorder(bt.root);
		System.out.println("");
		bt.levelorder(bt.root);
		System.out.println("");
		System.out.println(bt.inorderTraversal(bt.root));
		System.out.println(bt.preorderTraversal(bt.root));
		System.out.println(bt.postorderTraversal(bt.root));
	}

}

class BinaryTree {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root = null;
	
	public void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + ", ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + ", ");
			inorder(root.right);
		}
	}
	
	public void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + ", ");
		}
	}
	
	public void levelorder(Node root) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data + ", ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}
	
	public List<Integer> inorderTraversal(Node root) {
		List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
                list.add(root.data);
				root = root.right;
			}
		}
        return list;
	}
	
	public List<Integer> preorderTraversal(Node root) {
		List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				list.add(root.data);
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				root = root.right;
			}
		}
        return list;
	}
	
	public List<Integer> postorderTraversal(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.push(root);
                result.push(root.data); 
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        return result;
    }
	
	
}

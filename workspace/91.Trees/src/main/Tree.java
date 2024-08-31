package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {
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
	
	public void create(List<Integer> list) {
		int idx = 0;
		Node root = new Node(list.get(idx++));
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node p = queue.poll();
			int x = list.get(idx++);
			if (x != -1) {
				Node node = new Node(x);
				p.left = node;
				queue.add(node);
			}
			x = list.get(idx++);
			if (x != -1) {
				Node node = new Node(x);
				p.right = node;
				queue.add(node);
			}
		}
		 this.root = root;
	}
	
	public void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + ", ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void preorderIterative(Node root) {
		Stack<Node> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				System.out.print(root.data + ", ");
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				root = root.right;
			}
		}
	}
	
	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + ", ");
			inorder(root.right);
		}
	}
	
	public void inorderIterative(Node root) {
		Stack<Node> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				System.out.print(root.data + ", ");
				root = root.right;
			}
		}
	}
	
	public void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + ", ");
		}
	}
	
	public void postorderIterative(Node root) {
       if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> out = new Stack<>();
        while (!stack.empty()) {
            Node curr = stack.pop();
            out.push(curr.data);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!out.empty()) {
            System.out.print(out.pop() + ", ");
        }
	}
	
	public void levelorder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		System.out.print(root.data + ", ");
		queue.add(root);
		while (!queue.isEmpty()) {
			Node p = queue.poll();
			if (p.left != null) {
				System.out.print(p.left.data + ", ");
				queue.add(p.left);
			}
			if (p.right != null) {
				System.out.print(p.right.data + ", ");
				queue.add(p.right);
			}
		}
	}
	
	public int count(Node node) {
		if (root != null) {
			return count(node.left) + count(node.right) + 1;
		}
		return 0;
	}
	
	public int height(Node node) {
		int x = 0, y = 0;
		if (node == null) {
			return 0;
		}
		x = height(node.left);
		y = height(node.right);
		if (x > y) {
			return x + 1;  
		} else {
			return y + 1;
		}
	}
	
	public int leafNodes(Node node) {
		int x = 0, y = 0;
		if (node == null) {
			return 0;
		}
		x = leafNodes(node.left);
		y = leafNodes(node.right);
		if (node.left == null && node.right == null) {
			return x + y + 1;  
		} else {
			return x + y;
		}
	}

	public int nonLeafNodes(Node node) {
		int x = 0, y = 0;
		if (node == null) {
			return 0;
		}
		x = nonLeafNodes(node.left);
		y = nonLeafNodes(node.right);
		if (node.left != null || node.right != null) {
			return x + y + 1;  
		} else {
			return x + y;
		}
	}
	
	int preIndex = 0;
	public Node generateFromInorderAndPreorder(int[] inorder, int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}
		Node node = new Node(preorder[preIndex++]);
		if (start == end) {
			return node;
		}
		int splitIndex = searchInorder(inorder, start, end, node.data);
		node.left = generateFromInorderAndPreorder(inorder, preorder, start, splitIndex - 1);
		node.right = generateFromInorderAndPreorder(inorder, preorder, splitIndex + 1, end);
		return node;
	}

	int postIndex = 0;
	public Node generateFromInorderAndPostorder(int[] inorder, int[] postorder, int start, int end) {
		postIndex = postorder.length;
		if (start > end) {
			return null;
		}
		Node node = new Node(postorder[postIndex--]);
		if (start == end) {
			return node;
		}
		int splitIndex = searchInorder(inorder, start, end, node.data);
		node.right = generateFromInorderAndPreorder(inorder, postorder, splitIndex + 1, end);
		node.left = generateFromInorderAndPreorder(inorder, postorder, start, splitIndex - 1);
		return node;
	}
	
	public int searchInorder(int inArray[], int start, int end, int data){
	    for (int i = start; i<= end; i++){
	        if (inArray[i] == data){
	            return i;
	        }
	    }
	    return -1;
	}
}

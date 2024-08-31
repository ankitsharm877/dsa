package zenAndart;

import java.util.ArrayList;

public class Round3 {
	public static void main(String[] args) {
		// binary tree validate binary search tree
		// [2,1,3] -- 2, 1, 3
		Node root = new Node(2);
		root.left = new Node(1);
		root.right= new Node(3);
		System.out.println(validate(root));
		
		ArrayList<Integer> list = new ArrayList<>();
		inorder(root, list);
		System.out.println(list);
	}
//	O(n * logn)
//	//1
//	//2,3
//	
//	mergeSort() {
//		mergeSort() 
//		mergeSort()
//		mergedData()
//	}
	
	//inorder : 1,2,3
	//preorder : 2,1,3
	
	public static void inorder(Node root, ArrayList<Integer> list) {// 1,2,4,4^2, n^2
		if (root != null) {
			inorder(root.left, list);
			list.add(root.data);
			inorder(root.right, list);
		}
	}	
	public static boolean validate(Node root) {
		if (root == null) {
			return true;
		}
		validate(root.left); // n
		validate(root.right); //n
		if (root.left != null && root.right != null) {
			if (root.data > root.left.data && root.data < root.right.data) {
				return true;
			} else {
				return false;
			}
		} else if (root.left != null && root.right == null) {
			if (root.data > root.left.data) {
				return true;
			} else {
				return false;
			}
		} else if (root.left == null && root.right != null) {
			if (root.data < root.right.data) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

}

class Node  {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
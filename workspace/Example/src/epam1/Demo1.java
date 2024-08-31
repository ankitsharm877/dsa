package epam1;

public class Demo1 {
	
	private static int max = -1001;
	public static void main(String[] args) {
		//A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence 
		//has an edge connecting them. A node can only appear in the sequence at most once.
		//Note that the path does not need to pass through the root.
		//The path sum of a path is the sum of the node's values in the path.
		//Given the root of a binary tree, return the maximum path sum of any non-empty path.
//		Node root = new Node(-10);
//		root.left = new Node(90);
//		root.right = new Node(20);
//		root.right.left = new Node(15);
//		root.right.right = new Node(7);
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		//root.inorder(root, 0);
		pathSum(root);
        System.out.println(max);
	}
	
	
	public static int pathSum(Node root) {
		if (root == null) return 0;
        int ls = pathSum(root.left);
        int rs = pathSum(root.right);
        int tempMax = Math.max(root.val, root.val + ls);
        tempMax = Math.max(tempMax, root.val + rs);
        max = Math.max(max, root.val);
        max = Math.max(max, tempMax);
        max = Math.max(max, root.val + ls + rs);
        return tempMax;
	}

}

class Node {
	int val;
	Node left;
	Node right;
	
	Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.val + "->");
			inorder(root.right);
		}
	}
}

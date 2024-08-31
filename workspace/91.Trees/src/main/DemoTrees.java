package main;

public class DemoTrees {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.left.left = tree.new Node(4);
		tree.root.right = tree.new Node(3);
		tree.root.right.right = tree.new Node(5);
//		tree.preorder(tree.root);
//		System.out.println("");
//		tree.preorderIterative(tree.root);
//		System.out.println("");
//		tree.inorder(tree.root);
//		System.out.println("");
//		tree.inorderIterative(tree.root);
//		System.out.println("");
//		tree.postorder(tree.root);
//		System.out.println("");
//		tree.postorderIterative(tree.root);
//		System.out.println("");
		tree.levelorder(tree.root);
		System.out.println("");
		
	}

}

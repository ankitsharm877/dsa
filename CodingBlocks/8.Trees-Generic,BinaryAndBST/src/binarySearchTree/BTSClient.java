package binarySearchTree;

public class BTSClient {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		BTS tree = new BTS(arr);
		//tree.display();
		System.out.println(tree.find(40));
		System.out.println(tree.find(42));
		tree.inorder();
		System.out.println("");
		System.out.println("Max: " + tree.max());
		tree.add(90);
		tree.inorder();
		System.out.println("");
		tree.add(25);
		tree.inorder();
		tree.remove(20);
		System.out.println("");
		tree.inorder();
		System.out.println("");
		System.out.println("Is BST: " + tree.isBST());
	}

}

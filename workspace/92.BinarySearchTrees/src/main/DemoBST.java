package main;

public class DemoBST {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(20);
		bst.insert(8);
		bst.insert(30);
		bst.inorder(bst.root);
	}

}

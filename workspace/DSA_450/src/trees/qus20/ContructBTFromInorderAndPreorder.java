package trees.qus20;

import trees.Node;

public class ContructBTFromInorderAndPreorder {

	 public static Node buildTree(int inorder[], int preorder[], int n) {
		 return build(inorder, preorder, 0, n - 1);
	 }
	 
	 static int idx = 0;
	 public static Node build(int inorder[], int preorder[], int i, int j) {
		 if (i > j) {
			 return null;
		 }
		 Node root = new Node(preorder[idx++]);
		 if (i == j) {
			 return root;
		 }
		 int index = find(inorder, i , j, root.data);
		 root.left = build(inorder, preorder, i, index - 1);
		 root.right = build(inorder, preorder, index + 1, j);
		 return root;
		 
	 }
	private static int find(int[] inorder, int i, int j, int data) {
		for (int k = i; k <= j; k++) {
			if (inorder[k] == data) {
				return k;
			}
		}
		return -1;
	}
}

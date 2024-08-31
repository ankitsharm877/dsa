package trees.qus5;

public class MirrorTree {
	
	Node root;

	class Node {
		Node left;
		int data;
		Node right;
		public Node (int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + ", ");
			inorder(root.right);
		}
	}
	
	public static Node mirrorTree(Node root) {
		if (root == null) {
			return null;
		}
		Node mirror = new MirrorTree().new Node(root.data);
		mirror.right = mirrorTree(root.left);
		mirror.left = mirrorTree(root.right);
		return mirror;
	}
	
	public static void main(String args[]) {
		MirrorTree tree = new MirrorTree();
		tree.root = tree.new Node(5);
		tree.root.left = tree.new Node(3);
		tree.root.right = tree.new Node(6);
		tree.root.left.left = tree.new Node(2);
		tree.root.left.right = tree.new Node(4);
		inorder(tree.root);
		Node mirror = mirrorTree(tree.root);
		System.out.println("");
		inorder(mirror);
	}

}

package main;

public class AVL {
	Node root;
	
	class Node {
		Node left;
		int data;
		int height;
		Node right;
		public Node (int data) {
			this.data = data;
			this.height = 0;
			this.left = null;
			this.right = null;
		}
	}
	
	public Node insert(Node root, int key) {
		if (root == null) {
			Node p = new Node(key);
			p.height = 1;
			return p;
		}
		if (key < root.data) {
			root.left = insert(root.left, key);
		} else if (key > root.data) {
			root.right = insert(root.right, key);
		}
		root.height = nodeHeight(root);
		if (balanceFactor(root) == 2 && balanceFactor(root.left) == 1) {
			return LLRotation(root);
		} else if (balanceFactor(root) == 2 && balanceFactor(root.left) == -1) {
			return LRRotation(root);
		} else if (balanceFactor(root) == -2 && balanceFactor(root.left) == -1) {
			return RRRotation(root);
		} else if (balanceFactor(root) == -2 && balanceFactor(root.left) == 1) {
			return RLRotation(root);
		}
		return root;
	}
	
	public int nodeHeight(Node p) {
		int hl, hr;
		hl = p != null && p.left != null ? p.left.height : 0;
		hr = p != null && p.right != null ? p.right.height : 0;
		return hl > hr ? hl + 1 : hr + 1;
	}
	
	public int balanceFactor(Node p) {
		int hl, hr;
		hl = p != null && p.left != null ? p.left.height : 0;
		hr = p != null && p.right != null ? p.right.height : 0;
		return hl - hr;
	}
	
	public void inorder(Node p) {
		if (p != null) {
			inorder(p.left);
			System.out.println(p.data);
			inorder(p.right);
		}
	}
	
	public Node LLRotation(Node p) {
		Node pl = p.left;
		Node plr = p.right;
		
		pl.right = p;
		p.left = plr;
		p.height = nodeHeight(p);
		pl.height = nodeHeight(pl);
		
		if (this.root == p) {
			root = pl;
		}
		return pl;
	}
	
	public Node LRRotation(Node p) {
		Node pl = p.left;
		Node plr = pl.right;
		
		pl.right = plr.left;
		pl.left = plr.right;
		
		plr.left = pl;
		plr.right = p;
		
		pl.height = nodeHeight(pl);
		p.height = nodeHeight(p);
		plr.height = nodeHeight(plr);
		
		if (this.root == p) {
			this.root = plr;
		}
		return plr;
	}
	
	public Node RRRotation(Node p) {
		Node pr = p.right;
		Node prl = p.left;
		
		pr.left = p;
		p.right = prl;
		
		p.height = nodeHeight(p);
		pr.height = nodeHeight(pr);
		
		if (this.root == p) {
			root = pr;
		}
		return pr;
	}
	
	public Node RLRotation(Node p) {
		Node pr = p.right;
		Node prl = pr.left;
		
		pr.left = prl.right;
		pr.right = prl.left;
		
		prl.right = pr;
		prl.left = p;
		
		pr.height = nodeHeight(pr);
		p.height = nodeHeight(p);
		prl.height = nodeHeight(prl);
		
		if (this.root == p) {
			this.root = prl;
		}
		return prl;
	}
	
	public Node inPre(Node p) {
		while (p != null && p.right != null) {
			p = p.right;
		}
		return p;
	}
	
	public Node inSucc(Node p) {
		while (p != null && p.left != null) {
			p = p.left;
		}
		return p;
	}
	
	public Node delete(Node p, int key) {
		if (p == null) {
			return null;
		}
		if (p.left == null && p.right == null) {
			if (p == this.root) {
				this.root = null;
			}
			return null;
		}
		
		if (key < p.data) {
			p.left = delete(p.left, key);
		} else if (key < p.data) {
			p.right = delete(p.right, key);
		} else {
			Node q;
			if (nodeHeight(p.left) > nodeHeight(p.right)) {
				q = inPre(p.left);
				p.data = q.data;
				p.left = delete(p.left, key);
			} else {
				q = inSucc(p.right);
				p.data = q.data;
				p.right = delete(p.right, key);
			}
		}
		
		p.height = nodeHeight(p);
		
		if (balanceFactor(p) == 2 && balanceFactor(p.left) == 1) {  // L1 Rotation
	        return LLRotation(p);
	    } else if (balanceFactor(p) == 2 && balanceFactor(p.left) == -1){  // L-1 Rotation
	        return LRRotation(p);
	    } else if (balanceFactor(p) == -2 && balanceFactor(p.right) == -1){  // R-1 Rotation
	        return RRRotation(p);
	    } else if (balanceFactor(p) == -2 && balanceFactor(p.right) == 1){  // R1 Rotation
	        return RLRotation(p);
	    } else if (balanceFactor(p) == 2 && balanceFactor(p.left) == 0){  // L0 Rotation
	        return LLRotation(p);
	    } else if (balanceFactor(p) == -2 && balanceFactor(p.right) == 0){  // R0 Rotation
	        return RRRotation(p);
	    }
	    return p;
	}

}

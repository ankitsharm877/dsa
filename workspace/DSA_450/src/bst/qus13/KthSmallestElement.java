package bst.qus13;

import java.util.ArrayList;

import trees.Node;

public class KthSmallestElement {

	public int KthSmallestElement(Node root,int K)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        //System.out.print(list);
        return list.size() >= K ? list.get(K - 1) : -1;
    }
    
    public void inorder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
}

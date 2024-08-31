package bst.qus12;

import java.util.ArrayList;

import trees.Node;

public class KthLargestElement {

	public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        //System.out.print(list);
        return list.size() >= K ? list.get(list.size() - K) : -1;
    }
    
    public void inorder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
}

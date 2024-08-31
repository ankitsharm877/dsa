package bst.qus6;

import java.util.ArrayList;

import trees.Node;

public class PopulateInorderSuccessor {

	public void populateNext(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        populate(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            Node node = list.get(i);
            //node.next = list.get(i + 1);
        }
    }
    public void populate(Node root, ArrayList<Node> list) {
        if (root != null) {
            populate(root.left, list);
            list.add(root);
            populate(root.right, list);
        }
    }
}

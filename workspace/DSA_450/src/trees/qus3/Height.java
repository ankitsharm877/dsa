package trees.qus3;

import trees.Node;

public class Height {

	int height(Node node) {
        int x = 0, y = 0;
        if (node == null) {
            return 0;
        }
        x = height(node.left);
        y = height(node.right);
        if (x > y) {
            return x + 1;
        } else {
            return y + 1;
        }
    }
}

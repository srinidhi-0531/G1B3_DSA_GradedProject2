package gp2.binarytree;

public class BinToSkewed {
	NodesOfTree root;
    NodesOfTree head;

    void convertToSkewed() {
        convertToSkewedUtil(root);
    }

    void convertToSkewedUtil(NodesOfTree root) {
        if (root == null) {
            return;
        }

        convertToSkewedUtil(root.left);

        NodesOfTree rightChild = root.right;
        root.right = head;
        root.left = null;
        head = root;

        convertToSkewedUtil(rightChild);
    }

    void printInOrder() {
        NodesOfTree curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}

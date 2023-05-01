package gp2.binarytree;

public class MainBST {
    public static void main(String[] args) {
        BinToSkewed bst = new BinToSkewed();
        bst.root = new NodesOfTree(50);
        bst.root.left = new NodesOfTree(30);
        bst.root.right = new NodesOfTree(60);
        bst.root.left.left = new NodesOfTree(10);
        bst.root.right.left = new NodesOfTree(55);

        bst.convertToSkewed();
        bst.printInOrder();
    }
}
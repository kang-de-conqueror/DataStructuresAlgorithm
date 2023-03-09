package bst;

public class Node {
    private int key;
    private Node left;
    private Node right;

    public Node(int item) {
        this.key = item;
        this.left = this.right = null;
    }

    public int getKey() {
        return this.key;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

package Labs02.Dang4;

public class Node {
    protected Integer value;
    protected Node right;
    protected Node left;

    public Node(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

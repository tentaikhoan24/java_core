package Labs02.Dang4;

public class BinarySearchTree {
    public Node root;
    public BinarySearchTree() {
    }

   public Node insert(Node root, Integer value){
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
            return newNode;
        }
        if (value < root.value){
            if (root.left == null) {
                root.left = newNode;
                return newNode;
            } else {
                return insert(root.left, value);
            }
        }else {
            if (root.right == null) {
                root.right = newNode;
                return newNode;
            } else {
                return insert(root.right, value);
            }
        }
   }

   public Node search(Node root, Integer key) {
        if (root == null){
            return null;
        }
        if (key < root.value){
            return search(root.left, key);
        } else if (key > root.value) {
            return search(root.right, root.value);
        } else {
            return root;
        }
   }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(binarySearchTree.root, 8);
        binarySearchTree.insert(binarySearchTree.root, 9);
        binarySearchTree.insert(binarySearchTree.root, 3);
        binarySearchTree.insert(binarySearchTree.root, 1);
        binarySearchTree.insert(binarySearchTree.root, 0);
        System.out.println("Done");
        System.out.println(binarySearchTree.search(binarySearchTree.root, 1));
        System.out.println(binarySearchTree.search(binarySearchTree.root, 15));
    }
}

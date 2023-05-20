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

   public Node findMostLeftNode(Node root) {
        if (root == null) {
            return null;
        }
        Node mostLeftNode = root;
        while (mostLeftNode.left != null) {
            mostLeftNode = mostLeftNode.left;
        }
        return mostLeftNode;
   }

   public Node deleteNode(Node root, Integer key) {
        if (root == null) {
            return null;
        }
        if (key > root.value){
            root.right = deleteNode(root.right, key);
        } else if (key < root.value) {
             root.left = deleteNode(root.left, key);
        } else {
            if (root.right == null && root.left == null) { //Node la nut la
                return null;
            }
            if (root.left != null && root.right == null) {//Node co 1 cay con ben trai
                return root.left;
            }
            if (root.left == null && root.right != null) {//Node co 1 cay con ben phai
                return root.right;
            }
            //Node co 2 con->tim node trai cung ben phai thay the node tim duoc
            Node mostLeftNode = findMostLeftNode(root.right);
            root.value = mostLeftNode.value;
            root.right = deleteNode(root.right, mostLeftNode.value);
        }
       return root;
   }

    public static void main(String[] args) {
        Node root = new Node(15);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(root,10);
        binarySearchTree.insert(root,30);
        binarySearchTree.insert(root,7);
        binarySearchTree.insert(root,14);
        binarySearchTree.insert(root,20);
        binarySearchTree.insert(root,40);
        binarySearchTree.insert(root,9);
        binarySearchTree.insert(root,13);
        binarySearchTree.insert(root,28);
        binarySearchTree.insert(root,35);
        binarySearchTree.insert(root,8);
        binarySearchTree.insert(root,12);
        binarySearchTree.insert(root,29);
        binarySearchTree.insert(root,38);
        System.out.println("---");
        binarySearchTree.deleteNode(root, 15);
        System.out.println("---");
    }
}


public class BST {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else root.right = insertRec(root.right, key);
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(15);
        tree.inorder(); // 5 10 15 20
    }
}

// Height of a Binary Tree

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class HeightBT {

    static int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            return 1 + Math.max(lh, rh);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left = new Node(70);

        System.out.println(height(root));
    }
}

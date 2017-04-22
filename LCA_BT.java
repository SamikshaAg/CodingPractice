package mycodeschool;

import mycodeschool.Node;

public class LCA_BT {

    static boolean v1 = false, v2 = false;

    public static void main(String[] args) throws Exception {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        Node res = LCA(root, n1, n2);
        if (res == null) {
            System.out.print("NO LCA");
        } else {
            System.out.print(res.data);
        }
    }

    private static Node LCA(Node root, int n1, int n2) {
        v1 = false;
        v2 = false;
        Node lca = LCAUtil(root, n1, n2);
        if (v1 & v2) {
            return lca;
        }
        return null;
    }

    private static Node LCAUtil(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1) {
            v1 = true;
            return root;
        }
        if (root.data == n2) {
            v2 = true;
            return root;
        }
        Node lca_left = LCAUtil(root.left, n1, n2);
        Node lca_right = LCAUtil(root.right, n1, n2);

        if (lca_left != null && lca_right != null) {
            return root;
        }
        return (lca_left != null) ? lca_left : lca_right;
    }
}

public class NumberOfLeaves {

    // This will represent structure of every single node in a tree
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    static int count = 0;

    public static int numberOfLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        int left = numberOfLeaves(root.left);
        int right = numberOfLeaves(root.right);
        if (left == 0 && right == 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nodes = { 2, 1, -1, -1, 4, 3, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(numberOfLeaves(root));
    }
}
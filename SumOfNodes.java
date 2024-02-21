public class SumOfNodes {

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

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return (left + right + root.val);
    }

    public static void main(String[] args) {
        int[] nodes = { 2, 1, -1, -1, 4, 3, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(sumOfNodes(root));

    }
}
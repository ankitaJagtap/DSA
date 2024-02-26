import javax.swing.tree.TreeNode;

public class EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return false;
            } else {
                return true;
            }
        }
        boolean left = evaluateTree(root.left);
        System.out.println(left);
        boolean right = evaluateTree(root.right);
        if (root.val == 3) {
            return left && right;
        } else {
            return left || right;
        }
    }
}
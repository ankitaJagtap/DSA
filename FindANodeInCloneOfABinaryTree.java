import javax.swing.tree.TreeNode;

public class FindANodeInCloneOfABinaryTree {
    TreeNode left;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }
        left = getTargetCopy(original, cloned.left, target);
        if (left != null) {
            return left;
        }
        return (getTargetCopy(original, cloned.right, target));

    }
}
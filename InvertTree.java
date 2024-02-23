/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = new TreeNode();

        if (root == null) {
            return null;
        }
        if (root.left != null && root.right != null) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        if (root.left == null && root.right != null) {
            root.left = root.right;
            root.right = null;
        } else if (root.right == null && root.left != null) {
            root.right = root.left;
            root.left = null;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
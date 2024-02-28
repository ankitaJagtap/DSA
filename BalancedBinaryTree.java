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

    public static int isHeightBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isHeightBalanced(root.left);
        int right = isHeightBalanced(root.right);
        if (left == -1) {
            return -1;
        }
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        } else {
            return (Math.max(left, right) + 1);
        }
    }

    public boolean isBalanced(TreeNode root) {
        int result = isHeightBalanced(root);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
}
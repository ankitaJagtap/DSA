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

    public static void searchPaths(TreeNode root, String path, List<String> list) {
        if (root == null)
            return;
        path += root.val;
        if (root.left == null && root.right == null) {
            list.add(path);
        } else {
            path += "->";
            searchPaths(root.left, path, list);
            searchPaths(root.right, path, list);
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        String S = "";
        searchPaths(root, S, list);
        return list;
    }
}
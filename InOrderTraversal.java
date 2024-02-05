/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 
 public class InOrderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<>();
        while(true){
            while(A != null){
                stk.push(A);
                A = A.left;
            }
            if(stk.isEmpty())
                break;
            A = stk.pop();
            arr.add(A.val);
            A = A.right;
        }
        stk.clear();
        return arr;
    }
}

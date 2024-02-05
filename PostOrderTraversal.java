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
public class PostOrderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode prev = null;
        do{
            while(A != null){
                stk.push(A);
                A = A.left;
            }
            while(A == null && (!stk.isEmpty())){
                A = stk.peek();
                if(A.right == null || A.right == prev){
                    arr.add(A.val);
                    A = stk.pop();
                    prev = A;
                    A = null;
                }else{
                    A = A.right;
                }
            }
        }while(!stk.isEmpty());
        return arr;
    }
}

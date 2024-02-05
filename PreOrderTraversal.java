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
 
 public class PreOrderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<>();
        
        while(true){
            while(A != null){
                arrayList.add(A.val);
                stk.push(A);
                A = A.left;
            }
            if(stk.isEmpty())
                break;
            A = stk.pop();
            A = A.right;
        }
        stk.clear();
        return arrayList;
    }
}

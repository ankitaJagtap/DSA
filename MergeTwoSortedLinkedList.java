/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null){
            return B;
        }else if(B == null){
            return A;
        }
        
        ListNode newNode = new ListNode(0);
        newNode.next = null;
        ListNode temp = newNode;
        ListNode temp1 = A;
        ListNode temp2 = B;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        if(temp1 != null){
            temp.next = temp1;
        }else{
            temp.next = temp2;
        }
        temp = newNode.next;
        newNode.next = null;
        return temp;
    }
}

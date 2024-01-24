// Maximum Twin Sum Of A LinkedList
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PairSum {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode start = head;
        ListNode mid = head;
        int count = 0;
        ListNode prev = null;
        ListNode ahead;
        int max = Integer.MIN_VALUE;
        int res = 0;
        int i = 0;
        while(temp!=null){
            mid = mid.next;
            temp = temp.next.next;
        }
        
        while(mid!=null){
            ahead = mid.next;
            mid.next = prev;
            prev = mid;
            mid = ahead;
        }
        
        while(prev != null){
            res = start.val + prev.val;
            if(max < res){
                max = res;
            }
            start = start.next;
            prev = prev.next;
        }
        
        return max;
    }
}
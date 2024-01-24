// Delete the middle node of a linked list
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == 1) {
            temp = null;
            head = temp;
        } else if (count % 2 == 1) {
            ListNode fast = head.next;
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode assign = slow.next;
            slow.next = slow.next.next;
            assign = null;
        } else if (count % 2 == 0) {
            ListNode fast = head;
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode assign = slow.next;
            slow.next = slow.next.next;
            assign = null;
        }
        return head;
    }
}
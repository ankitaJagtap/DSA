// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

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
class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode temp1 = head;
        int count = 0;
        // p.next = null;
        while (temp1 != null) {
            count++;
            temp1 = temp1.next;
        }
        if (head == null) {
            return null;
        } else if (count == 1) {
            return head;
        } else if (count == 2) {
            return head;
        } else if (count % 2 != 0) {
            ListNode even = head.next;
            ListNode p = even;
            ListNode temp = p;
            while (odd.next != null) {
                even = odd.next;
                if (p != even) {
                    p.next = even;
                    p = p.next;
                }
                odd.next = odd.next.next;
                odd = odd.next;
                even.next = null;
                even = even.next;
            }
            odd.next = temp;
        } else if (count % 2 == 0) {
            ListNode even = head.next;
            ListNode p = even;
            ListNode temp = p;
            while (odd.next.next != null) {
                even = odd.next;
                if (p != even) {
                    p.next = even;
                    p = p.next;
                }
                odd.next = odd.next.next;
                odd = odd.next;
                even.next = null;
                even = even.next;
            }
            p.next = odd.next;
            odd.next = temp;
        }

        return head;
    }
}
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

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        if(head == null) return null;
        if (head != null) prev = new ListNode(head.val);

        while(curr.next != null){
            next = curr.next;
            ListNode obj = new ListNode(next.val);
            obj.next = prev;
            prev = obj;
            curr = curr.next;
        }
        return prev;
    }
}

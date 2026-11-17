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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        while(head != null){
            map.put(count, head);
            head = head.next;
            count++;
        }
        return map.get(count/2);

    }
}
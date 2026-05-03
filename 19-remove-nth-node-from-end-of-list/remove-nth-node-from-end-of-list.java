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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow= dummy;
        ListNode fast = dummy;
        int cnt=0;
        while(cnt<=n){
            fast = fast.next;
            cnt++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next; // head is no longer the orginal head if it was deleted

    }
}
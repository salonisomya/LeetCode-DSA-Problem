/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean cycle = false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                cycle = true;
                break;}
        }
        if(cycle){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
        return null;
    }
}
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       // reverse
       ListNode temp = slow;
       ListNode front = temp;
       ListNode prev = null;
       while(temp!=null){
        front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
       }
       ListNode l = head;
       ListNode r = prev;
       while(r != null){
        if(l.val != r.val ) return false;
        l = l.next;
        r= r.next;
       }
       return true;
    }
}
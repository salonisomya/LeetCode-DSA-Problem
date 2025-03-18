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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode n1 = head;
        ListNode n2 = head.next;
        ListNode even = head.next;
        while(n1.next != null && n2.next != null){
            n1.next = n2.next;
            n2.next = n2.next.next;
            n1= n1.next;
            n2= n2.next;
        }
        n1.next = even;
        return head;
    }
}
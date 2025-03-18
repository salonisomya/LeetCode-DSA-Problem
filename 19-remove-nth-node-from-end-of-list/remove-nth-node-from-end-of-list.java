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
        if(head == null) return head;
        int len =0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len == n){
            return head.next;
        }
        int x = len-n;
        temp = head;
        int z = 1;
        while(z!=x){
            temp = temp.next;
            z++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
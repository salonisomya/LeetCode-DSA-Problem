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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return head;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int n = len/2;
        if(len == n || n ==0){
            return head.next;
        }
        int z =1;
        temp = head;
        while(z!=n){
            temp = temp.next;
            z++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
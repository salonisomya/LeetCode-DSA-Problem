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
    static ListNode mid(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static ListNode merge (ListNode list1 , ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode m = mid(head);
        ListNode right = m.next;
        m.next = null;
        ListNode left = head;
        left = sortList(left);
        right = sortList(right);
        return merge(left,right);
        
    }
}
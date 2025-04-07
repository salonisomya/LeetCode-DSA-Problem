/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map = new HashMap<>();
        ListNode tempA = headA;
        while(tempA != null){
            map.put(tempA,tempA.val);
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        while(tempB != null){
            if (map.containsKey(tempB)) {
                return tempB;  // First node found in both lists
            }
            tempB = tempB.next;
        } 
        return null;
    }
}
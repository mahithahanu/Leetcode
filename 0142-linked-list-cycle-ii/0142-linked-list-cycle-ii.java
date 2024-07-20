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
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null){
            return null;
        }
        int c=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        ListNode a=head;
        while(slow!=null && slow.next!=null){
        if(slow==a){
            return slow;
        }
        else{
            slow=slow.next;
            a=a.next;
        }
        }
        return null;
    }
}
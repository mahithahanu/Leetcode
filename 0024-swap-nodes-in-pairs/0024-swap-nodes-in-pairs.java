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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
            ListNode cur=head;
            ListNode current=head.next;
           ListNode list =new ListNode(0);
           ListNode temp=list;
           while(cur!=null && current!=null){
            temp.next=new ListNode(current.val);
            temp=temp.next;
            temp.next=new ListNode(cur.val);
            temp=temp.next;
            if(cur.next.next==null)
            {
                break;
            }
            if(current.next.next==null)
            {
                temp.next=cur.next.next;
                break;
            }
            cur=cur.next.next;
            current=current.next.next;
           }
        return list.next;
    }
}
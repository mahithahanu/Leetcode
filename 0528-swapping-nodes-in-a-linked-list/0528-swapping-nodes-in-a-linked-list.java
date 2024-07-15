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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t=head;
        ListNode q=head;
        ListNode cur=head;
        int n=0;
        while(cur!=null){
            n=n+1;
            if(n==k){
                t=cur;
            }
            cur=cur.next;
        }
        cur=head;
        for(int i=1;i<n-k+1;i++){
             cur=cur.next;
             q=cur;
        }
        int temp=t.val;
         t.val=q.val;
         q.val=temp;
        return head;
    }
}
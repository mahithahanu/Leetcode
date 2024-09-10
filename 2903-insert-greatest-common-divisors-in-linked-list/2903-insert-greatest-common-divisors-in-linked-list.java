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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur=head;
        ListNode cur1=head;
        ListNode t=new ListNode(0);
        ListNode current=t;
         Queue<ListNode> queue = new LinkedList<>();
        if(head==null){
            return null;
        }
        if(head.next==null){
            current.next=head;
        }
        int h=0;
        while(head!=null){
            h+=1;
            head=head.next;
        }
        // System.out.println(h);
        while(cur.next!=null ){
        ListNode c=greatestCommon(cur.val,cur.next.val);
        queue.offer(c);
        cur=cur.next;
        }
         int d=0;
        while(d!=2*h){
         if(d%2==0){
            current.next=cur1;
            cur1=cur1.next;
            // System.out.println(cur.val);
            current=current.next;
           }
           else{
            current.next=queue.poll();
            // System.out.println(queue.poll());
            current=current.next;
           }
           d+=1;
        }
        return t.next;
    }
     ListNode greatestCommon(int a,int b){
        if(b==0){
            return new ListNode(a);
        }
        else{
            return greatestCommon(b,a%b);
        }
     }
}
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // List<Integer>l1=new ArrayList<>();
        int l=0;
        ListNode[] dummy=new ListNode[k];
        // ListNode t=dummy;
        ListNode cur=head;
        int n=0;
        while(cur!=null){
            n=n+1;
            cur=cur.next;
        }
        cur=head;
        int c=n/k;
        int d=n%k;
        for(int j=0;j<k;j++){
            dummy[j]=cur;
            if(n<k)
            {
                d=0;
            }
            int q=c+(d>0?1:0);
            if(d>0)
            {
                d--;
            }
           for(int i=0;i<q-1;i++){
            if(cur!=null){
            cur=cur.next;
            }
           }
            System.out.println(l);
            l=0;
           if(cur!=null){
            ListNode np=cur.next;
            // System.out.println(cur.val);
            cur.next=null;
            // System.out.println(np.val);
            cur=np;
           }
        }
return dummy;
    }
}
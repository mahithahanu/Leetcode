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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode cur=head;
        // int n=0;
        // while(cur!=null){
        //     n=n+1;
        //     cur=cur.next;
        // }
        while(cur!=null){
            s.push(cur.val);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
         if(s.pop()!=cur.val){
            return false;
         }
          cur=cur.next;
        }
        return true;
        
       
    }
}
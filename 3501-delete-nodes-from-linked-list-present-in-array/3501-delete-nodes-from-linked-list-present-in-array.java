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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode list=new ListNode(0);
        ListNode cur=list;
        cur.next=head;
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        while(cur.next!=null){
        if(st.contains(cur.next.val)){
            cur.next=cur.next.next;
        }
        else{
            cur=cur.next;
        }
      }
       return list.next;
    }
}
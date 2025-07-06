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
    public ListNode doubleIt(ListNode head) {
        ListNode tr=head;
        ListNode pre=null;
        while(tr!=null){
            ListNode fwd=tr.next;
            tr.next=pre;
            pre=tr;
            tr=fwd;
        }
        int carry=0;
        while(pre!=null){
            int pro=pre.val*2;
            carry=pro/10;
        }
    }
}

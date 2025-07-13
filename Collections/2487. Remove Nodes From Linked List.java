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
    public ListNode removeNodes(ListNode head) {
        ListNode tr=head;
        ListNode pre=null;
        ListNode newNode=new ListNode();
        while(tr!=null){
            ListNode fwd=tr.next;
            tr.next=pre;
            pre=tr;
            tr=fwd;
        }
        int max=0;
        ListNode ptr=pre;
        ListNode tr2=newNode;
        while(ptr!=null){
            if(ptr.val >=max){
               ListNode n=new ListNode(ptr.val);
               tr2.next=n;
               tr2=tr2.next;
               max=ptr.val;
            }
            ptr=ptr.next;
        }
        ListNode curr=newNode.next;
        ListNode pre2=null;
        while(curr!=null){
            ListNode f=curr.next;
            curr.next=pre2;
            pre2=curr;
            curr=f;
        }
        return pre2;
    }
}

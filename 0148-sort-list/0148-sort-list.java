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
    public ListNode middle (ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1, ListNode l2){
        
        ListNode dummy = new ListNode (-1);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if (l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        } 
        else if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode middleElement =  middle(head);
        ListNode middleNext= middleElement.next;
        middleElement.next=null;
        ListNode first= sortList(head);
        middleNext=sortList(middleNext);
        
        return merge(first,middleNext);
    }
}
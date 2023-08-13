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
    static ListNode middleOfList(ListNode head)
    {
        ListNode slow = head;
        ListNode fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next= head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    static boolean isPalindrome(ListNode head){
        if(head==null) return true;
        ListNode middleElement= middleOfList(head);
        ListNode afterMiddleList= reverse(middleElement.next);
        ListNode pntr1= head;
        ListNode pntr2= afterMiddleList;
        
        while(pntr2!=null){
            if(pntr1.val!=pntr2.val) return false;
            pntr1=pntr1.next;
            pntr2=pntr2.next;
        }
        return true;  
    }
}
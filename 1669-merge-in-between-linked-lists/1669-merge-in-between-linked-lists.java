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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list2==null) return list1;
        if(list1==null) return list2;
        ListNode dummy = new ListNode(0);
        dummy.next=list1;
        ListNode curr = dummy;
        
        for (int i=0; i<a;i++){
            curr=curr.next;
        }
        ListNode nodebeforeA= curr;
        
        for (int i=a; i<=b;i++){
            curr=curr.next;
        }
        ListNode nodeafterB= curr.next;
        
        nodebeforeA.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = nodeafterB;

        return dummy.next;
    }
}
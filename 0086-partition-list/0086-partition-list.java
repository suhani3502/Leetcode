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
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(0);
    ListNode greaterDummy = new ListNode(0);
    
    ListNode lessCurrent = lessDummy;
    ListNode greaterCurrent = greaterDummy;
    
    ListNode current = head;
    
    while (current != null) {
        if (current.val < x) {
            lessCurrent.next = current;
            lessCurrent = lessCurrent.next;
        } else {
            greaterCurrent.next = current;
            greaterCurrent = greaterCurrent.next;
        }
        
        current = current.next;
    }
    
    lessCurrent.next = greaterDummy.next;
    greaterCurrent.next = null; 
    
    return lessDummy.next; 
    }
}
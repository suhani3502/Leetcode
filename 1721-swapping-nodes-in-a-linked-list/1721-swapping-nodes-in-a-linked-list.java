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
    public int Lengthget(ListNode head){
        int cnt=0;
        for (ListNode curr=head; curr!=null ; curr=curr.next){
            cnt++;
        }
        return cnt;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int length = Lengthget(head);
        if (head == null) return null;

        ListNode curr = head;
        int m = length - k + 1;
        ListNode first = null;
        ListNode second = null;

        // Traverse the list to find the k-th and m-th nodes
        for (int i = 1; i <= length; i++) {
            if (i == k) {
                first = curr;
            }
            if (i == m) {
                second = curr;
            }
            curr = curr.next;
        }

        // Swap the values of the k-th and m-th nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
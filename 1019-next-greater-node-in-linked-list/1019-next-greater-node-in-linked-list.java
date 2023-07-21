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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list= new ArrayList<>();
        Deque <Integer> stack = new ArrayDeque<>();
        for (; head!=null ; head=head.next){
            while(!stack.isEmpty() && head.val> list.get(stack.peek())){
                int index= stack.pop();
                list.set(index, head.val);
            }
            stack.push(list.size());
            list.add(head.val);
        }
        while(!stack.isEmpty()){
            list.set(stack.pop() , 0);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
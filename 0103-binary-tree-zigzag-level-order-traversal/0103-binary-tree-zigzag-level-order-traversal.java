/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int level=q.size();
            ArrayList<Integer> sublist= new ArrayList<Integer>(level);
            for(int i=0; i<level;i++){
                int index=i;
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                if(flag==true) sublist.add(q.poll().val);
                else sublist.add(0,q.poll().val);
            }
            flag=!flag;
            ans.add(sublist);
        }
        return ans;
        
    }
}
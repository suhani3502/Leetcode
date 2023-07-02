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
    public List<Integer> rightside(TreeNode root , int currDepth , List<Integer> ans){
        if (root==null) return ans;
        
        if (currDepth== ans.size()) ans.add(root.val);
        
        rightside(root.right, currDepth+1, ans);
        rightside(root.left, currDepth+1 , ans);
        return ans;
    } 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        return rightside(root, 0, ans);
    }
}
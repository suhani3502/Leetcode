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
    public int depth(TreeNode root){
        if (root==null) return 0;
        int min_path=0;
        int path=0;
        if (root!=null && root.left!=null && root.right!=null) {
             path=path+1;
             int right=depth(root.right);
             int left=depth(root.left);
             min_path = Math.min(left,right);
        }
        else if (root.right==null)
            min_path=depth(root.left);
        else if (root.left==null)
            min_path=depth(root.right);
        
        return min_path+1;
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return depth(root);
    }
}
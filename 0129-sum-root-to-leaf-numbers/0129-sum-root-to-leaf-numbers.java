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
    public int recursion (TreeNode root, int sum){
        if (root==null) return 0;
        sum= sum*10 + root.val;
        if (root.right==null && root.left==null) return sum;
        
        int leftSum = recursion(root.left, sum);
        int rightSum = recursion (root.right,sum);
        
        return leftSum + rightSum;
    }
    public int sumNumbers(TreeNode root) {
        return recursion (root,0);
    }
   
}
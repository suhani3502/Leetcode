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
    public void postorder (TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
        return;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> post = new ArrayList<Integer>();
        if(root==null) return post;
        else{
            postorder(root,post); 
        }
        return post;
    }
}
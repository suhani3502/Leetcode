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
    public List<String> path(TreeNode root, StringBuilder sb, List<String> arr){
        if(root==null) return arr;
        if(root.right==null && root.left==null){
            arr.add(sb.append(root.val).toString());   
        }
        
        final int length = sb.length();
        path(root.left, sb.append(root.val).append("->"), arr);
        sb.setLength(length);
        path(root.right, sb.append(root.val).append("->"), arr);
        sb.setLength(length);
        return arr;
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr= new ArrayList<String>();
        return path(root, new StringBuilder(), arr);   
    }
}
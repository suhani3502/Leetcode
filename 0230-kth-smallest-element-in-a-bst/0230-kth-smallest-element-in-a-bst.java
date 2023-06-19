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
    public ArrayList<Integer> smallest(TreeNode root , ArrayList<Integer> arr){
        if(root==null) return null;
        else{
            arr.add(root.val);
        }
        smallest(root.left,arr);
        smallest(root.right,arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        smallest(root, arr);
        Collections.sort(arr);
        return arr.get(k-1);
        
    }
}
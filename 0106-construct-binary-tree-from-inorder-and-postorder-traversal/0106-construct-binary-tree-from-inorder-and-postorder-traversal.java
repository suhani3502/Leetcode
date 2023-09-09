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
    public TreeNode recursion (int[] inorder , int is, int ie, int[] postorder , int ps, int pe, Map<Integer, Integer> map){
        if (ps>pe || is>ie) return null;
        
        TreeNode root = new TreeNode(postorder[pe]);
        int inroot= map.get(postorder[pe]);
        int numsleft = inroot-is;
        root.left= recursion(inorder , is, inroot-1, postorder, ps, ps+numsleft-1, map);
        root.right=recursion(inorder, inroot+1, ie, postorder, ps+numsleft, pe-1, map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<inorder.length; ++i){
            map.put(inorder[i],i);
        }
        return recursion(inorder, 0, inorder.length-1, postorder, 0 , postorder.length-1, map);
    }
}
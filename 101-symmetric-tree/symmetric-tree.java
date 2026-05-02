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
    public boolean solve(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if((p==null && q!=null) || (p!=null && q==null) || p.val!=q.val) return false;

        // mirror for symmetric
        boolean a = solve(p.left, q.right);
        boolean b = solve(p.right, q.left);
        return a && b;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return solve(root.left, root.right);
    }
}
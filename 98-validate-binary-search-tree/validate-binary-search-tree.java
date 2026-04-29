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
    TreeNode prev;
    // boolean flag;
    public boolean isValidBST(TreeNode root) {
        return helper(root);
    }
    private boolean helper(TreeNode root){
        // base case
        if (root == null) return true;

        // left
        boolean left = helper(root.left);
        if(prev!=null && root.val<=prev.val){
            return false;
        }
        this.prev = root;
        // right
        boolean right = true;
        if(left){
            right =helper(root.right); //conditional recursion 
        }
        return left && right;

    }
}
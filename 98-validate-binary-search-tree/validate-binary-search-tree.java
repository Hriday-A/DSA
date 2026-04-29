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
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        this.flag= true;
        helper(root);
        return flag;
    }
    private void helper(TreeNode root){
        // base case
        if (root == null) return;

        // left
        helper(root.left);
        if(prev!=null && root.val<=prev.val){
            this.flag=false;
        }
        this.prev = root;
        // right
        helper(root.right);
    }
}
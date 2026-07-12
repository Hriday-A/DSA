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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        this.max=0;
        int temp= helper(root);
        return max;
    }
    private int helper(TreeNode root){
        // base 
        if(root==null) return 0;
        //logic 
        int l = helper(root.left);
        int r= helper(root.right);
        int d = l+r;
        max= Math.max(d,max);
        return Math.max(l,r)+1;

    }
}
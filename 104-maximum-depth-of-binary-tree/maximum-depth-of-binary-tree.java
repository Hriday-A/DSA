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
    int maxD;
    public int maxDepth(TreeNode root) {
        this.maxD=0;
        Depth(root,0);
        return maxD;
    }
    private void Depth(TreeNode root,int count){
        //base
        if(root==null){
            this.maxD= Math.max(maxD,count);
            return;
        }
        //logic 
        Depth(root.left,count+1);
        Depth(root.right,count+1);
    }
}
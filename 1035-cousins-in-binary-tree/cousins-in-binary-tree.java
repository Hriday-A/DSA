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

// Defination of cousins here is - same level but not same root
// This indicates BFS
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        q.add(root);
        pq.add(null);
        while(!q.isEmpty()){
            int size = q.size();
            boolean xf= false; TreeNode xp = null;
            boolean yf = false; TreeNode yp = null;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                TreeNode pcurr = pq.poll();
                if(curr.val==x){
                    xf= true;
                    xp = pcurr;
                }
                if(curr.val==y){
                    yf= true;
                    yp = pcurr;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                    pq.add(curr);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    pq.add(curr);
                }
            }
            if(xf && yf) return xp!=yp;
            if(xf || yf) return false;
        }
        return false;
    }
}
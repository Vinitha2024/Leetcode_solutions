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
    public boolean isSymmetric(TreeNode root) {
        TreeNode a=root.left;
        TreeNode b=root.right;
        return Mirror(a,b);      
    }
    public boolean Mirror(TreeNode p,TreeNode q){
        if(p==null || q==null){
            if(p==null && q==null)
               return true;
            return false;
        }
        if((p.val==q.val)&& Mirror(p.left,q.right) && Mirror(p.right,q.left)){
             return true;
        }
        return false;
    }
}

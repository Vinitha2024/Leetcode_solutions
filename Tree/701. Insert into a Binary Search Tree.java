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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode tr=root;
        TreeNode newNode=new TreeNode(val);
        if(root==null){
         root=newNode;
         return root;
        }
        while(tr!=null){
            if(val<tr.val){
                if(tr.left==null){
                  tr.left=newNode;
                  break;}
                  else
                  tr=tr.left;
            }
            else{
                if(tr.right==null){
                   tr.right=newNode;
                   break;
                  }
                  else
                  tr=tr.right;
            }
        }
        return root;
    }
}

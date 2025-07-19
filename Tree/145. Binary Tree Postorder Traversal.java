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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> l=new ArrayList<>();
       traversal(root,l);
       return l;
    }
    public void traversal(TreeNode r,List<Integer> l){
        if(r!=null){
            traversal(r.left,l);
            traversal(r.right,l);
            l.add(r.val);
        }
    }

}

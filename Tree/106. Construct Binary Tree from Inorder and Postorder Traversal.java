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
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
        return helper(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] i,int[] p,int s,int e){
      if(s>e)
        return null;
      int val=p[index--];
      int found=0;
      for(int j=s;j<=e;j++){
        if(val==i[j]){
            found=j;
            break;
        }
      }
      TreeNode root=new TreeNode(val);
      root.right=helper(i,p,found+1,e);
      root.left=helper(i,p,s,found-1);
      return root;
    }
}

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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode root1=new TreeNode(0);
        if(root==null){ return root;}
        if(root.val==val){
          return root;  
        }
        if(root.val>val){
         root1.left=searchBST(root.left,val);
        }
         else{
         root1.left= searchBST(root.right,val);
         }
        return root1.left;
    }
}
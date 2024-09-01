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
    List<Integer>l=new ArrayList<>();
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c=0;
        minHeigth(root,c);
        return Collections.min(l);
    }
    void minHeigth(TreeNode root,int c){
        if(root==null){
            return;
        }
        c=c+1;
        if(root.left==null && root.right==null){
            l.add(c);
        }
        minHeigth(root.left,c);
        minHeigth(root.right,c);
        // System.out.println(l);
    }
}
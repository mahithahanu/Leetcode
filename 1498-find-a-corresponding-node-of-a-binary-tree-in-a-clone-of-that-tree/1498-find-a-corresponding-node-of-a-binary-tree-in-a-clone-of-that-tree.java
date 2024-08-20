/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode c;
        if(cloned==null){
            return null;
        }
        if(original==target){
            return cloned;
        }
        c=getTargetCopy(original.right,cloned.right,target);
        if(c!=null){
            return c;
        }
        return getTargetCopy(original.left,cloned.left,target);
    }
}
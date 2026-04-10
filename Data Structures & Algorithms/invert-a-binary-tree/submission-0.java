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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
    public TreeNode helper(TreeNode nod){
        if(nod == null){
            return null;
        }
        helper(nod.left);
        helper(nod.right);
        TreeNode temp = nod.left;
        nod.left = nod.right;
        nod.right = temp;
        return nod;
    }
}

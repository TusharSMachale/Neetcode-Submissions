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
    int max = 1;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return helper(root, max);
        
    }
    public int helper(TreeNode root, int max){
        if(root == null) return 0;

        int l = helper(root.left, max);
        int r = helper(root.right, max);

        // max = Math.max(max, l+r);
        return Math.max(l,r)+1;

    }
}

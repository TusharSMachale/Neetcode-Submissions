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
    public boolean isValidBST(TreeNode root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return isValid(root, min, max);
    }

    public boolean isValid(TreeNode nod, int low, int high){
        if(nod == null){
            return true;
        }
        if(nod.val <= low || nod.val >= high){
            return false;
        }       
        return isValid(nod.left, low, nod.val) && isValid(nod.right, nod.val, high);       
        
    }}

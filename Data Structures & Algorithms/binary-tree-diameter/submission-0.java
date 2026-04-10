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
    public int dfs(TreeNode curr, int[] arr){
        if(curr == null){
            return 0;
        }
        int left = dfs(curr.left, arr);
        int right = dfs(curr.right, arr);

        arr[0] = Math.max(arr[0], 1 + left + right);
        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        int result = Math.max(dfs(root, ans), ans[0]) - 1;
        return result;
    }
}

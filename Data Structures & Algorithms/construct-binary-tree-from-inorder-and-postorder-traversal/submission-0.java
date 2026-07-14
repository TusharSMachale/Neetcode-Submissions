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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        TreeNode root = build(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);

        return root;
    }
    public TreeNode build(int[] postorder, int pstart, int pend, int[] inorder, int istart, int iend, Map<Integer, Integer> map){
        if(pstart > pend || istart > iend) return null;

        int rval = postorder[pend];
         TreeNode root = new TreeNode(rval);

        int rpos = map.get(rval);
        int lft = rpos - istart;

        root.left = build(postorder, pstart, pstart+lft-1, inorder, istart, rpos-1, map);

        root.right = build(postorder, pstart+lft, pend-1, inorder, rpos+1, iend, map);
        
        return root;
    }
}
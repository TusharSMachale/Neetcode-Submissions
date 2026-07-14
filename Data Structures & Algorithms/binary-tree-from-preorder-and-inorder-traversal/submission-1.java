// import java.util.HashMap;
// import java.util.Map;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode build(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend, Map<Integer, Integer> map) {
        // Base case: if there are no elements to construct the tree
        if (pstart > pend || istart > iend) return null;

        // 1. The first element in preorder traversal is always the root node
        int rootVal = preorder[pstart];
        TreeNode root = new TreeNode(rootVal);

        // 2. Find the index of this root in the inorder traversal
        int rpos = map.get(rootVal);

        // 3. Calculate how many elements belong to the left subtree
        int leftTreeSize = rpos - istart;

        // 4. Recursively build left and right subtrees with precise boundaries
        root.left = build(preorder, pstart + 1, pstart + leftTreeSize, inorder, istart, rpos - 1, map);
        root.right = build(preorder, pstart + leftTreeSize + 1, pend, inorder, rpos + 1, iend, map);

        return root;
    }
}

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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                sb.append("n ");
                continue;
            }else{
                sb.append(curr.val + " ");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;
        
        String[] s = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        q.add(root);

        for(int i=1; i<s.length; i++){
            TreeNode curr = q.poll();

            if(!s[i].equals("n")){
                TreeNode l = new TreeNode(Integer.parseInt(s[i]));
                curr.left = l;
                q.add(l);
            }

            if(!s[++i].equals("n")){
                TreeNode r = new TreeNode(Integer.parseInt(s[i]));
                curr.right = r;
                q.add(r);
            }
        }
        return root;
    }
}

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
    private static int ans ;
    public int maxPathSum(TreeNode root) {
     ans = Integer.MIN_VALUE ;
        dfs(root);
        return ans ;
    }
    private int dfs(TreeNode root){
        if(root == null) return 0 ;
        int leftsum = Math.max(0, dfs(root.left));
        int rightsum = Math.max(0, dfs(root.right));
        ans = Math.max(ans, root.val + leftsum + rightsum);

        return Math.max(root.val + leftsum, root.val + rightsum); 
    }
}
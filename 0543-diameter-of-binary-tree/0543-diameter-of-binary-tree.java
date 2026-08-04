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
    public int diameterOfBinaryTree(TreeNode root) {
        int []soln=new int[1];
        dfs(root,soln);
        return soln[0];
        
    }
    private int dfs(TreeNode root, int [] soln )
    {
        if(root == null)
        return 0;
        int left=dfs(root.left,soln);
        int right=dfs(root.right,soln);
        soln[0]=Math.max(soln[0],left+right);
        return Math.max(left, right)+1;

    }

}
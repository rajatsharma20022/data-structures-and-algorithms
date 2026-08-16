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
    int count=0;
    private void dfs(TreeNode node , int MaxSoFar){
        if(node == null){
        return;
        }
        if(MaxSoFar <= node.val){
            MaxSoFar = node.val;
            count ++;
        }
        dfs(node.left, MaxSoFar);
        dfs(node.right, MaxSoFar);


    }
    public int goodNodes(TreeNode root) {
        dfs(root,Integer.MIN_VALUE);
        return count;
        
    }
}
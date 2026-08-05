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
    public boolean isBalanced(TreeNode root) {
    int [] arr=new int[1];
    dfs(root,arr);
    if(arr[0]==0)
    return true;
    else
    return false;
        
    }
    private int dfs(TreeNode root,int [] arr){
        if(root== null)
        return -1;
        int left=dfs(root.left,arr);
        int right = dfs(root.right,arr);
        if(Math.abs(left - right) >1)
         arr[0]+=1;
        return Math.max(left,right)+1;
    }


    }
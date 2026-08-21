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
    int pre_idx=0;
    HashMap<Integer,Integer> index=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            index.put(inorder[i],i);
        }
        int l=0;
        int r=inorder.length-1;
        return dfs(preorder,l,r);

        
    }
    private TreeNode dfs(int [] preorder,int l,int r){
        if(l > r)
        return null;
        int root_val=preorder[pre_idx++];
        TreeNode root=new TreeNode(root_val);
        int mid=index.get(root_val);
        root.left=dfs(preorder,l,mid-1);
        root.right=dfs(preorder,mid+1,r);
        return root;
    }
}
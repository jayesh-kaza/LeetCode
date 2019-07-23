/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    static int ans;
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        ans = Math.max(ans,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        ans = -1;
        int h = height(root);
        return ans-1;
        
    }
}

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
    
    public boolean checkSum(TreeNode root,int sum,int currSum)
    {
        if(root==null)
            return false;
        currSum += root.val;
        if(currSum==sum && root.left==null && root.right==null)
            return true;
        
        return checkSum(root.left,sum,currSum) || checkSum(root.right,sum,currSum);
        
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root==null)
            return false;
    
        return checkSum(root,sum,0);

    }
}

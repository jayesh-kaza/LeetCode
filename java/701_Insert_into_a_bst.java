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
    
   
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null)
            return root;
        
        TreeNode temp = root;

        while(true)
        {
            if (temp.val < val)
            { 
                if (temp.right==null){
                    temp.right = new TreeNode(val); 
                    break;
                }
                else
                    temp = temp.right;
            }
            else
            { 
                if (temp.left==null){ 
                    temp.left = new TreeNode(val);
                    break;
                }
                else 
                    temp = temp.left;
            }
       
        }
        return root;
    }
}

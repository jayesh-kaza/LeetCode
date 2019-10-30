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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ansList = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        if(root==null)
            return ansList;
        
        while(root!=null || !myStack.empty()){
            while(root!=null){
                myStack.add(root);
                root = root.left;
            }
            root = myStack.pop();
            ansList.add(root.val);
            root = root.right;
        }
        return ansList;
    }
}

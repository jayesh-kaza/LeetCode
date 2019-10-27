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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagorder = new ArrayList<>();
        if(root == null) return zigzagorder;
        Stack<TreeNode> stack1 = new Stack<>();
        // Queue<TreeNode> queue = new LinkList<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        List<Integer> temp ;
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            temp = new ArrayList<>();
            while(!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                // System.out.println("stack1: " + node.val);
                temp.add(node.val);
                if(node.left != null) stack2.push(node.left);
                if(node.right != null) stack2.push(node.right);
                
            }
            if (temp.size() != 0) zigzagorder.add(temp);
            temp = new ArrayList<>();
            while(!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                // System.out.println("stack2: " + node.val);
                temp.add(node.val);
                if(node.right != null) stack1.push(node.right);
                if(node.left != null) stack1.push(node.left);
            }
            if (temp.size() != 0) zigzagorder.add(temp);
        }
        return zigzagorder;
    }
}

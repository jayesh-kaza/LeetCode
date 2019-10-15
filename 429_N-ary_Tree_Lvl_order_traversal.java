/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ansList = new LinkedList();
        if(root==null)
            return ansList;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> currLevel = new ArrayList<>();
            int len = queue.size();
            for(int i=0;i<len;i++)
            {
                Node temp = queue.poll();
                currLevel.add(temp.val);
                for(Node child : temp.children)
                    queue.add(child);
            }
            ansList.add(currLevel);
        }
        return ansList;
    }
}

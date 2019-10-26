/**
 * Question link https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */

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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Integer>> verticalTraversalTreeMap = new TreeMap<>();
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> verticalTraversalWithAdditionConditionTreeMap =
                new TreeMap<>();

        verticalTraversalUtilWithAdditionCondition(root, verticalTraversalWithAdditionConditionTreeMap, 0, 0);
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, TreeMap<Integer, List<Integer>>> entry : verticalTraversalWithAdditionConditionTreeMap.entrySet())  {
            TreeMap<Integer, List<Integer>> treeMap = entry.getValue();
            List<Integer> listLevel = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> entry1 : treeMap.entrySet()) {
                List<Integer> list = entry1.getValue();
                Collections.sort(list);
                listLevel.addAll(list);
            }
            result.add(listLevel);
        }
        return result;
    }

    private void verticalTraversalUtilWithAdditionCondition(TreeNode root,
                                                            TreeMap<Integer, TreeMap<Integer, List<Integer>>> verticalTraversalWithAdditionConditionTreeMap,
                                                            int distanceFromOriginAlongXaxis, int level) {

        if (root == null) return;
        if (verticalTraversalWithAdditionConditionTreeMap.get(distanceFromOriginAlongXaxis) == null) {
            TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            treeMap.put(level, list);
            verticalTraversalWithAdditionConditionTreeMap.put(distanceFromOriginAlongXaxis, treeMap);
        } else {
            TreeMap<Integer, List<Integer>> treeMap =
                    verticalTraversalWithAdditionConditionTreeMap.get(distanceFromOriginAlongXaxis);

            if (treeMap.get(level) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                treeMap.put(level, list);
            } else {
                List<Integer> list = treeMap.get(level);
                list.add(root.val);
                treeMap.put(level, list);
                verticalTraversalWithAdditionConditionTreeMap.put(distanceFromOriginAlongXaxis, treeMap);
            }
            verticalTraversalWithAdditionConditionTreeMap.put(distanceFromOriginAlongXaxis, treeMap);
        }
        verticalTraversalUtilWithAdditionCondition(root.left, verticalTraversalWithAdditionConditionTreeMap,
                distanceFromOriginAlongXaxis - 1, level + 1);
        verticalTraversalUtilWithAdditionCondition(root.right, verticalTraversalWithAdditionConditionTreeMap,
                distanceFromOriginAlongXaxis + 1, level + 1);
    }
}
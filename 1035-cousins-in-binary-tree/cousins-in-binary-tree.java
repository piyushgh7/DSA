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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                set.add(current.val);
                if (current.left != null && current.right != null) {
                    int num1 = current.left.val;
                    int num2 = current.right.val;
                    if ((num1 == x && num2 == y) || (num1==y && num2==x)){
                        return false;
                    }
                }
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            if (set.contains(x) && set.contains(y)) return true;
            set.clear();
        }
        return false;
    }
}
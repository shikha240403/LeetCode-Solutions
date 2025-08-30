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
    int func(TreeNode root, boolean bit) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return bit ? root.val : 0;
        return func(root.left, true) + func(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return func(root, false);
    }
}
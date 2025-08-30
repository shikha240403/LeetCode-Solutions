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
    TreeNode findSubtreeMin(TreeNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    TreeNode deleteNode(TreeNode node, int key) {
        if (node == null)
            return null;

        if (key < node.val)
            node.left = deleteNode(node.left, key);
        else if (key > node.val)
            node.right = deleteNode(node.right, key);
        else {
            if (node.left == null && node.right == null) {
                return null;
            }
            else if (node.left == null) {
                return node.right;
            }
            else if (node.right == null) {
                return node.left;
            }
            else {
                TreeNode successor = findSubtreeMin(node.right);
                node.val = successor.val;
                node.right = deleteNode(node.right, successor.val);
            }
        }
        return node;
    }
}
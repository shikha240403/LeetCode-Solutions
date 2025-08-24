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

    public static int depthHelper(TreeNode root){
        if(root == null)return 0;

        int leftHeight = depthHelper(root.left);
        int rightHeight = depthHelper(root.right);

        if(leftHeight == 0 || rightHeight == 0)
        return Math.max(leftHeight , rightHeight) + 1;

        return Math.min(leftHeight,rightHeight) + 1;
    }

    public int minDepth(TreeNode root) {
        return depthHelper(root);
    }
}
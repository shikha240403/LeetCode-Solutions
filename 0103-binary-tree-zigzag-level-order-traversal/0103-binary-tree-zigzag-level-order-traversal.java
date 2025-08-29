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

    public static void zigzagHelper(TreeNode root,List<List<Integer>> result){
        if(root == null)return;

        Queue<TreeNode> memory = new LinkedList<>();
        memory.offer(root);
        int flag = 0;

        while(!memory.isEmpty()){
            int size = memory.size();
            List<Integer> ans = new ArrayList<Integer>();

            for(int i=0;i<size;i++){
                TreeNode temp = memory.poll();

                ans.add(temp.val);

                if(temp.left != null)memory.offer(temp.left);
                if(temp.right != null)memory.offer(temp.right);
            }

            if(flag == 0) result.add(ans);
            else {
                Collections.reverse(ans);
                result.add(ans);
            }
            flag = 1 - flag;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        zigzagHelper(root,result);

        return result;
    }
}
// Problem URL: https://leetcode.com/problems/binary-tree-postorder-traversal/

/*
Steps:
Step 1: Define a List that returns the result
Step 2: If root is null return the result
Step 3: If root not null, Call inorder recursively for root.left, inoder for root.right, result.add(value)
*/

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
class PostorderTraversal {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return result;
        }
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
        }
        return result;
    }
}
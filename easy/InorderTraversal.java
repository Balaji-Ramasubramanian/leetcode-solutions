// Problem URL: https://leetcode.com/problems/binary-tree-inorder-traversal/

/*
Steps:
Step 1: Define a List that returns the result
Step 2: If root is null return the result
Step 3: If root not null, Call inorder recursively for root.left, result.add(value), inoder for root.right
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
class InorderTraversal {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return result;
        }
        if(root != null){
            inorderTraversal(root.left);
            result.add(root.val);
            inorderTraversal(root.right);
        }
        return result;
    }
}
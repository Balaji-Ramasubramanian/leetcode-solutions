// Problem URL: https://leetcode.com/problems/binary-tree-preorder-traversal/

/*
Steps:
Step 1: Define a List that returns the result
Step 2: If root is null return the result
Step 3: If root not null result.add(value), Call inorder recursively for root.left, inoder for root.right.
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
class PreorderTraversal {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return result;
        }
        if(root != null){
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
}
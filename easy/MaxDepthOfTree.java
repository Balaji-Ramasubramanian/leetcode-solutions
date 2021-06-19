// Problem URL: https://leetcode.com/problems/maximum-depth-of-binary-tree/


/*
Steps:
Step 1. If root is null return 0
Step 2. Get maxDepth(left node) & maxDepth(right node)
Step 3. Return the max(leftDepth, rightDepth)+1
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
class MaxDepthOfTree {
    public int maxDepth(TreeNode root) {
         if (root == null)
            return 0;
        else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
             else
                return (rightDepth + 1);
        }
    }
}
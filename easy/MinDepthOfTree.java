// Problem URL: https://leetcode.com/problems/minimum-depth-of-binary-tree/

/*
Steps:
Step 1: If root is null return 0.
Step 2: If both left & right nodes are null, return 1
Step 3: If left subtree is null, traverse the right subtree to find minDepth
Step 4: If right subtree is null, traverse the left subtree to find minDepth
Step 5: Else, return the min(minDepth(left), minDepth(right))+1
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
class MinDepthOfTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;
 
        return Math.min(minDepth(root.left),
                        minDepth(root.right)) + 1;
    }
}
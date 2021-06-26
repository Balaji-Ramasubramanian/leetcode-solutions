// Problem URL: https://leetcode.com/problems/same-tree/

/*
Steps:
Step 1: Check if p & q both are null, and return true
Step 2: If Any one of p & q null and not other, then return true
Step 3: If p.val != q.val then return false
Step 4: Call recursively this function for left subtree & right subtree if any of the result false, then the whole result is false
Step 5: Finally, return true at the end of the execution as its not traced as false on the above execution
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
class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val ){
            return false;
        }
        if(! isSameTree(p.left, q.left)) return false;
        if(! isSameTree(p.right, q.right)) return false;
        return true;
    }
}
// Problem URL: https://leetcode.com/problems/validate-binary-search-tree/

/*
The root element's value should be the max of its left subtree & min of its righ subtree. By checking this constraint recursively, we can check isBST.

Step 1: Return true if node is null
Step 2: Return false if node's value less then min or greater than max allowed value.
Step 3: Recursivly call its isBST(left_subtree with min, root.val-1) && isBST(right_subtree, root.val+1, max)

*/

class IsValidBST {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
       return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean isBST(TreeNode root, int min, int max){
        if(root == null) {
            return true;
        }
        if(root.val < min || root.val > max){
            return false;
        }
        return isBST(root.left, min, root.val-1) && isBST(root.right, root.val+1, max);
    }
}
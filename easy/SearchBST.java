// Problem URL: https://leetcode.com/problems/search-in-a-binary-search-tree/

/*
Step 1: Check if root.val = val return root if true
Step 2: If root.val < val iterate over the right elements
Step 3: Else iterate over left elements. Continue until root != null
*/

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
class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null){
            if(root.val == val){
                return root;
            } else if (root.val < val){
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}
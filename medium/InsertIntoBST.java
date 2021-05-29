// Problem URL: https://leetcode.com/problems/insert-into-a-binary-search-tree/

/*
Step 1: Check if root is null. if true, return new TreeNode(val)
Step 2: If root value is less than the insertion value, iterate to root.right
            if root has right element then assign root.right to root 
            else root.right = new TreeNode(val) & break the loop
        Else 
            if root has left element assign  root.left to root
            else root.left = new TreeNode(val) & break the loop
Step 3: Return the root pointer node
*/

//Definition for a binary tree node.
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
class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode rootptr = root;
        if(root == null){
           return new TreeNode(val);
        }
        while(root != null) {
            if(root.val < val){
                if(root.right != null){
                    root = root.right;
                } else {
                    root.right = new TreeNode(val);
                    break;
                }
            } else {
                if(root.left != null){
                    root = root.left;
                } else {
                    root.left = new TreeNode(val);
                    break;
                }
            }
        }
        return rootptr;
    }
}
class Solution {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || ( p.val<=root.val && q.val>=root.val ) || ( p.val>=root.val && q.val<=root.val)){
            return root;
        }
        
// If both p and q values are greater than the current root value, search in the right subtree
         if(p.val>root.val){
             
             return lowestCommonAncestor( root.right,  p,  q);
         }
// If both p and q values are smaller than the current root value, search in the left subtree
          return lowestCommonAncestor( root.left,  p,  q);

        
    }
}
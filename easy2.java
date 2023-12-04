class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      return sortedArrayToBST(nums,0,nums.length-1);
    }
        
    private TreeNode sortedArrayToBST(int[] nums,int l,int r) {
        if(l<=r) 
        {
             // Calculate the middle index
            int mid=l+(r-l)/2;
            TreeNode root=new TreeNode(nums[mid]);
            
         // Recursively build the left subtree with elements to the left of mid
            root.left=sortedArrayToBST(nums,l,mid-1);
            
         // Recursively build the right subtree with elements to the right of mid
            root.right=sortedArrayToBST(nums,mid+1,r);
            return root;
        }
        return null;
    }
}
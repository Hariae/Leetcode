package leetcodeProblems;

public class Convert_Sorted_Array_Into_BST_108 {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) 
		{ 
			this.val = x; 
			this.right = this.left = null;
		}
	}
	
	
	public TreeNode insert(TreeNode root, int num) {
		
		TreeNode temp = new TreeNode(num);
		if(root == null) {
			root = temp;
		}
		else {
			if(num < root.val) {
				root = insert(root.left, num);
			}
			else {
				root = insert(root.right, num);
			}
		}
		
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
	    TreeNode root = null;   
		for(int i=0;i<nums.length;i++) {
	    	   root = insert(root, nums[i]);
	       }
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert_Sorted_Array_Into_BST_108 obj = new Convert_Sorted_Array_Into_BST_108();
	}

}

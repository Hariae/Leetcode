package Tress;
import java.util.*;

public class BST_Exact {
	
	public class TreeNode{
		int data;
		TreeNode right;
		TreeNode left;
		
		public TreeNode(int data) {
			this.data = data;
			this.right = this.left = null;
		}
	}
	public List<Integer> res = new ArrayList<Integer>();
	public int i=0;
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			res.add(root.data);
			inorder(root.right);
		}
	}
	
	public void re_inorder(TreeNode root) {
		if(root != null) {
			re_inorder(root.left);
			if(res.get(i) == root.data) {
				res.remove(i);
				res.add(i, -1);
				i++;
			}
			re_inorder(root.right);
		}
	}
	
	public boolean isExact(TreeNode root) {
		//List<Integer> res = new ArrayList<Integer>();
		inorder(root);
		
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
		//root.right.right = new TreeNode(21);
		re_inorder(root);
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST_Exact obj = new BST_Exact();
		TreeNode root = obj.new TreeNode(5);
		
		root.left = obj.new TreeNode(10);
		root.right = obj.new TreeNode(7);
		root.left.left = obj.new TreeNode(12);
		root.left.right = obj.new TreeNode(4);
		root.right.left = obj.new TreeNode(25);
		root.right.right = obj.new TreeNode(20);
		
		
		obj.isExact(root);

	}

}

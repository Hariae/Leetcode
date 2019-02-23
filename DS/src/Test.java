import Tress.BST_Exact.TreeNode;
import java.util.*;
public class Test {
	
	public class TreeNode{
		int data;
		TreeNode right;
		TreeNode left;
		
		public TreeNode(int data) {
			this.data = data;
			this.right = this.left = null;
		}
	}
	
	//public static List<Integer> items = new ArrayList<Integer>();
	//public static List<Integer> values = new ArrayList<Integer>();
	//public int counter = 0;
	public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	public void traverse(TreeNode root) {
		if(root != null) {
			traverse(root.left);
			traverse(root.right);
			//items.add(root.data);
			if(root.left != null && root.right != null) {
				/*
				 * values.add((root.left.data + root.right.data + root.data) /(++counter + 2) );
				 */	
				hm.put(root.data, root.left.data + root.right.data + root.data);
				root.data = root.left.data + root.right.data + root.data;
			}
			
			if(root.left == null && root.right != null) {
				/*
				 * values.add(root.right.data + root.data /(++counter + 2) );
				 */
				hm.put(root.data, root.right.data + root.data);
				root.data = root.right.data + root.data;
			}
			if(root.right == null  && root.left != null) {
				/*
				 * values.add(root.left.data + root.data /(++counter + 2) );
				 */
				hm.put(root.data, root.left.data + root.data);
				root.data = root.left.data + root.data;
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		
		TreeNode root = obj.new TreeNode(5);
		
		root.left = obj.new TreeNode(10);
		root.right = obj.new TreeNode(7);
		root.left.left = obj.new TreeNode(12);
		root.left.right = obj.new TreeNode(4);
		root.right.left = obj.new TreeNode(25);
		root.right.right = obj.new TreeNode(20);
		//TreeNode dupRoot = root.
		obj.traverse(root);
		System.out.print(root.data);
		
		
		
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}  
		
	}

}

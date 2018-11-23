package Tress;

public class Sample {
	public class Node{		
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	
	public Node insert(Node root, int data) {
		Node temp = new Node(data);
		if(root == null) {
			root = temp;
		}
		else {
			if(data < root.data) {
				root.left = insert(root.left, data);
			}
			else {
				root.right = insert(root.right, data);
			}
		}
		
		return root;
	}
	
	public void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	
	public void postorder(Node root) {
		if(root == null) 
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	
	public void preorder(Node root) {
		if(root == null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);		
	}
	
	public Node deleteNode(Node root, int data) {
		if(root == null) 
			return root;
		
		if(data < root.data) {
			root.left = deleteNode(root.left, data);
		}
		else if(data > root.data) {
			root.right = deleteNode(root.right, data);
		}
		else {
			if(root.right == null) {
				return root.left;
			}
			if(root.left == null) {
				return root.right;
			}
			
			root.data = minValue(root.right);
			System.out.println("Min Value: "+ root.data);
			root.right = deleteNode(root.right, root.data);
		}
		
		return root;
	}
	
	public int minValue(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		
		return root.data;
	}
	
	public int maxDepth(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			int lDepth = maxDepth(root.left);
			int rDepth = maxDepth(root.right);
			
			if(lDepth >= rDepth) {
				return (lDepth+1);
			}
			else {
				return (rDepth+1);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		Node root = null;
		root = obj.insert(root, 10);
		root = obj.insert(root, 5);
		root = obj.insert(root,  25);
		root = obj.insert(root, 2);
		root = obj.insert(root,  4);
		root = obj.insert(root, 209);
		root = obj.insert(root,  22);
//		root = obj.insert(root, 12);
//		root = obj.insert(root,  23);
//		root = obj.insert(root, 18);

//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.right.data);
//		System.out.println(root.left.left.data);
		
		obj.inorder(root);
		System.out.println();
//		obj.preorder(root);
//		System.out.println();
//		obj.postorder(root);
		
		root = obj.deleteNode(root, 10);
		obj.inorder(root);
		
		System.out.println("Depth: "+obj.maxDepth(root));
		
		root = obj.deleteNode(root, 2);
		obj.inorder(root);
		System.out.println("Depth: "+obj.maxDepth(root));
	}

}

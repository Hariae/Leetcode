package Tress;

public class Trees {
	int data;
	public class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public Node insert(Node root, int data) {
		Node temp = new Node(data);
		
		if(root == null) {
			root = temp;
		}
		else {
			Node curr = root;
			if(curr.data >= data) {
				curr.left = insert(curr.left, data);
			}
			else {
				curr.right = insert(curr.right, data);
			}
		}
		
		
		
		return root;
	}
	
	public void inOrder(Node root) {
		if(root != null) {
			if(root.left != null) {
				inOrder(root.left);
			}
			System.out.print(root.data + " ");
			if(root.right != null) {
				inOrder(root.right);
			}
		}
		
	}
	
	public void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		//Node root = new Node(20);
		
		Trees obj = new Trees();
		Node root = null;
		root = obj.insert(root, 20);
		root = obj.insert(root, 10);
		root = obj.insert(root, 30);
		root = obj.insert(root, 5);
		root = obj.insert(root, 12);
		root = obj.insert(root, 25);
		root = obj.insert(root, 50);
		System.out.println("In Order...");
		obj.inOrder(root);
		System.out.println();
		System.out.println("Pre Order...");
		obj.preOrder(root);
		System.out.println();
		System.out.println("Post Order...");
		obj.postOrder(root);
	}

}

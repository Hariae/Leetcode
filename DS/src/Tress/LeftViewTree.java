package Tress;

public class LeftViewTree {
	
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
	
	public void printTree(Node root) {
		if(root != null) {
			printTree(root.left);
			System.out.print(root.data + " ");
			printTree(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftViewTree obj = new LeftViewTree();
		Node root = null;
		root = obj.insert(root, 7);
		root = obj.insert(root, 4);
		root = obj.insert(root, 21);
		root = obj.insert(root, 2);
		root = obj.insert(root, 8);
		root = obj.insert(root, 60);
		root = obj.insert(root, 9);
		root = obj.insert(root, 81);
		
		obj.printTree(root);

	}

}

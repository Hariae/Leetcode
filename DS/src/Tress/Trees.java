package Tress;

public class Trees {
	int data;

	public class Node {
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

		if (root == null) {
			root = temp;
		} else {
			Node curr = root;
			if (curr.data >= data) {
				curr.left = insert(curr.left, data);
			} else {
				curr.right = insert(curr.right, data);
			}
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			if (root.left != null) {
				inOrder(root.left);
			}
			System.out.print(root.data + " ");
			if (root.right != null) {
				inOrder(root.right);
			}
		}

	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			if (lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
			// return 0;
		}
		// return 0;
	}

	public void levelOrderTraversal(Node root, int level) {
		if (level == 1) {
			if (root != null) {
				System.out.print(root.data + " ");
			}
		} else {
			if (root != null) {
				levelOrderTraversal(root.left, level - 1);
				levelOrderTraversal(root.right, level - 1);
			}

		}

	}

	public void printLevelOrder(Node root) {
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			System.out.println();
			levelOrderTraversal(root, i);

		}
	}

	static int max_level = 0;

	public void printLeftView(Node root, int level) {
		if (root == null)
			return;
		else {
			if (max_level < level) {
				System.out.print(root.data + " ");
				max_level = level;
			}
			printLeftView(root.left, level + 1);
			printLeftView(root.right, level + 1);
		}
	}
	
	static int max_level_right = 0;
	public void printRightView(Node root, int level) {
		if (root == null)
			return;
		else {
			if (max_level_right < level) {
				System.out.print(root.data + " ");
				max_level_right = level;
			}
			printRightView(root.right, level + 1);
			printRightView(root.left, level + 1);
		}
	}

	public int findMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		else {
			int data = root.data;
			int lMax = findMax(root.left);
			int rMax = findMax(root.right);

			if (lMax > data) {
				data = lMax;
			}
			if (rMax > data) {

				data = rMax;
			}

			return data;
		}
	}

	public int findMin(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			int min = root.data;
			int lMin = findMin(root.left);
			int rMin = findMin(root.right);

			if (lMin < min) {
				min = lMin;
			}
			if (rMin < min) {
				min = rMin;
			}
			return min;
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello");

		// Node root = new Node(20);

		Trees obj = new Trees();
		Node root = null;
		root = obj.insert(root, 20);
		root = obj.insert(root, 10);
		root = obj.insert(root, 30);
		root = obj.insert(root, 5);
		root = obj.insert(root, 12);
		root = obj.insert(root, 25);
		root = obj.insert(root, 14);
		System.out.println("In Order...");
		obj.inOrder(root);
		System.out.println();
		System.out.println("Pre Order...");
		obj.preOrder(root);
		System.out.println();
		System.out.println("Post Order...");
		obj.postOrder(root);
		System.out.println("Height: " + obj.height(root));
		System.out.println("Level Order: ");
		obj.printLevelOrder(root);
		System.out.println();
		System.out.println("Max: " + obj.findMax(root));
		System.out.println("Min: " + obj.findMin(root));
		System.out.println("Left View: ");
		obj.printLeftView(root, 1);
		System.out.println();
		System.out.println("Right View: ");
		obj.printRightView(root, 1);

	}

}

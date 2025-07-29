package Tree;

public class BinaryTree {
	public Node root;
	
	/**
	 * this Node class using constructor get the integer data and set the value into the data
	 */
	class Node{
		int data;
		Node left, right;
		public Node(int d ){
			data = d;
			left = null;
			right = null;			
		}		
	}
	
	/**
	 * while Intializing instance get the data create node and set into the root 
	 * @param d
	 */
	public BinaryTree(int d) {
		root = new Node(d);
	}
	
	/**
	 * while get the Node and data in the parameter set the value Node left
	 * @param r
	 * @param data
	 */
	public void insertLeft(Node r, int data) {
		Node newNode = new Node(data);
		r.left = newNode;
	}
	
	/**
	 * while get the Node and data in the parameter set the value Node Right
	 * @param r
	 * @param data
	 */
	public void insertRight(Node r, int data) {
		Node newNode = new Node(data);
		r.right = newNode;
	}
	
	/**
	 * Traversal for PreOrder
	 * @param root
	 */
	public static void preOrder(Node root) {
		if(root != null) {
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	/**
	 * Traversal for inOrder
	 * @param root
	 */
	public static void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
		
	}
	
	/**
	 * Traversal for postOrder
	 * @param root
	 */
	public static void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" "+root.data);
		}
		
	}


}

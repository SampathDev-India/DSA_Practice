package Tree;

public class BinarySearchTree {
	Node root ;
	
	class Node {
		int key ;
		Node left, right;
		Node(int val){
			key = val;
			left = null;
			right = null;
		}
	}
	
	public BinarySearchTree() {
		root = null;		
	}
	public BinarySearchTree(int val) {
		root = new Node(val);	
	}
	
//	public void insertt(int val ) {
//		root = insert(root,val);		
//	}
//	
//	public static Node insert(Node root, int val) {
//		if(root == null) {
////			Node newNode = new Node(val);
////			return newNode;
//			return new Node(val);
//		}
//		
//		// if the val is less than root Value --> we have to insert left side
//		if(val < root.key) {
//			root.left = insert(root.left, val);
//		}else { 		// if the val is greater than root Value --> we have to insert right side
//			root.right= insert(root.right,val);			
//		}		
//		return root;
//	}
	
	/**
	 * Print the values based on the inOrder - left, root, right
	 * @param root
	 */
	public void inOrder(Node root) {
		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);		
	}
	

}

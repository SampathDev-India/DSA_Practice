package DSA_Executor;

import Tree.BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree(10);
		tree.insertLeft(tree.root , 11); 
		tree.insertRight(tree.root, 12);
		
//	    tree traversal 3 types 
//		1. PreOrder 	- root , left , right
//		2. InOrder		- left , root , right
//		3. PostOrder	- left , right , root
		
		System.out.println("Pre Order : ");
		BinaryTree.preOrder(tree.root);
		System.out.println("\nIn Order : ");
		BinaryTree.inOrder(tree.root);
		System.out.println("\nPost Order : ");
		BinaryTree.postOrder(tree.root);



	}

}

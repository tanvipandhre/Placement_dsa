package com.placement.dsa.bst;

public class deleteNode_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(9);
		root.left = new Node(8);
		root.right = new Node(12);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);
		root.left.left.left.left = new Node(2);
		root.left.left.left.right = new Node(4);
		root.left.left.right = new Node(7);
		root.left.left.right.left = new Node(6);
		root.left.left.right.right = new Node(8);
		
		Node rootNode = deleteNode(root, 5);
		System.out.println(rootNode.data );
		
		
	}
	public static Node deleteNode(Node root, int key) {
		//koi node del krna nai
		if( root == null )
			return null;
		//root hi key ho toh
		if(root.data == key )
			return helper(root);
		Node dummy = root;
		//root given he toh
		while (root != null ) {
			//first check ki right jana ki left
			//left
			if( root.data > key) {
				//agr left me key mila toh
				if( root.left != null && root.left.data == key) {
					root.left = helper(root.left); //5
					break;
				}
				//left me key nai mila toh aur left jao
				else
					root = root.left;
			}
			//right
			else {
				if(root.right != null && root.right.data == key) {
					root.right = helper( root.right );
					break;
				}
				else
					root = root.right;
			}
		}
		return dummy;
		
		
	}
	//joining function
	public static Node helper(Node root) { //5
		if( root.left == null)
			return root.right;
		if(root.right == null )
			return root.left;
		Node rightChild = root.right; //7
		Node lastRight= findLastRight(root.left); //lastRight = 4 // root.left = 3
		lastRight.right = rightChild; //joining condition
		return root.left; //3
	}
	
	public static Node findLastRight(Node root) {
		if(root.right == null)
			return root;
		return findLastRight( root.right );
					
	}

}

package com.placement.dsa.bst;

public class findCeil_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(13);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.left.right.right = new Node(9);
		
		int ceil = findCeil( root, 8);
		System.out.println(ceil);
	}
	public static int findCeil(Node root, int key) {
		int ceil = -1;
		while( root != null ) {
			 if(root.data == key) {
				 ceil = root.data;
				 return ceil;
			 }
			 if( key > root.data ) {
				 	root = root.right;
			 }
			 else {
				 ceil = root.data;  // least no jo ceil bane
				 root = root.left;
			 }
		}
		return ceil;
	}
}

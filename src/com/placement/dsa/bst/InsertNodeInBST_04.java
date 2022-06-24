package com.placement.dsa.bst;

public class InsertNodeInBST_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		
		Node rootNode = insertIntoBST(root, 5);
		System.out.println( rootNode.data );

	}
	public static Node insertIntoBST(Node root, int val) {
		if(root == null)
			return new Node(val);
		Node curr = root;
		while(true) {
			if( curr.data <= val) {
				if( curr.right != null )
					curr = curr.right;
				else {
					curr.left = new Node(val);
					break;
				}
				
			}else {
				if( curr.left != null )
					curr = curr.left;
				else {
					curr.left = new Node(val);
					break;
				}
			}
		
		}
			return root;
	}

}

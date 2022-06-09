package com.placement.dsa.bt;

public class maxDepth_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		/*root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);*/
		
		int height = heightOfTree(root);
		System.out.println("Height of tree is "+ height);

	}
	public static int heightOfTree(Node root) {
		if(root == null) return 0;
		int lh = heightOfTree(root.left);
		int rh = heightOfTree(root.right);
		
		return 1 + Math.max(lh, rh);
		
	}

}

package com.placement.dsa.bt;

public class isBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);
		root.left.left.left.left = new Node(6);
		Boolean b = isBalancedTree(root);
		System.out.println("Is tree balanced? "+ b);
	}
	
	public static boolean isBalancedTree(Node root) {
		
		return dfsHeight(root) != -1;
		
		
	}
	public static int dfsHeight(Node root) {
		if(root == null) return 0;
		int lh = dfsHeight(root.left);
		int rh = dfsHeight(root.right);
		if(lh == -1 || rh == -1) return -1;
		if(Math.abs( lh - rh ) > 1) return -1;
		return 1 + Math.max(lh,rh);
	}

}

package com.placement.dsa.bt;

//Diameter of binary tree is the longest path between any two nodes. It may or may not pass through the root. 
public class Diameter_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);
		root.left.left.left.left = new Node(6);
		int dia = diameter(root);
		System.out.println("Diameter of tree is "+ dia);
		
	}
	
	public static int diameter(Node root) {
		int[] dia = new int[1];
		height(root, dia);
		return dia[0];
	}
	
	public static int height(Node root, int[] dia) {
		if(root == null)
			return 0;
		int lh = height(root.left, dia);
		int rh = height(root.right, dia);
		dia[0] = Math.max(dia[0], lh+rh);
		return 1 + Math.max(lh, rh);
		
		
	}
	

}

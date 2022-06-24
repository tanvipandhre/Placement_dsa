package com.placement.dsa.bst;

public class isValidBST_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(13);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(7);
		root.left.right = new Node(12);
		root.right.left = new Node(14);
		root.right.right = new Node(17);
		boolean isItBST = isValidBST(root);
		System.out.println(isItBST);
		
	}
	public static boolean isValidBST(Node root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isValidBST(Node root, long minVal, long maxVal) {
		if(root == null)
			return true;
		if(root.data >= maxVal || root.data <= minVal)
			return false;
		
		return isValidBST(root.left, minVal, root.data)
				&& isValidBST(root.right, root.data, maxVal);
	}

}

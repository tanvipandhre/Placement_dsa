package com.placement.dsa.bst;

public class KSmallestElement_06 {
	static int ans = -1;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.left.left.right = new Node(2);
		int smallestNo = kSmallest(root, 3);
		System.out.println(smallestNo);
	}
	public static void inorder(Node root, int k) {
		
		if( root == null)
			return;
		inorder(root.left, k); //inorder trav is sorted form in BST
		if(++count == k) {
			ans = root.data;
			return;
		}
		inorder(root.right, k);
		
	}
	public static int kSmallest(Node root, int k) {
		inorder(root, k);
		return ans;
		
	}
	

}

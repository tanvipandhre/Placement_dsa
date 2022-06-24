package com.placement.dsa.bst;

import com.placement.dsa.bst.Node;

class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int key) {
		data = key;
		left = right = null;
	}
	
}

public class searchBST_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
		root.left = new Node(5);
		root.left.left = new Node(4);
		root.right = new Node(12);
		root.right.left = new Node(10);
		root.right.right = new Node(14);
		Node searchedNode = searchBST(root, 10);
		System.out.println( searchedNode.data);
	}
	public static Node searchBST(Node root, int val) {
		while(root !=null && root.data != val) {
			root = val < root.data ? root.left : root.right; // if val is less than root data then go left else go right
		}
		return root;
		
	}

}

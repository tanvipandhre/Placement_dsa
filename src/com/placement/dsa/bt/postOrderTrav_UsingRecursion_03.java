package com.placement.dsa.bt;

import java.util.ArrayList;

public class postOrderTrav_UsingRecursion_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.left.right = new Node(7);
		root.right.left.right.left = new Node(9);
		root.right.left.right.right = new Node(10);
		
		ArrayList<Integer> postOrderList = new ArrayList<>();
		
		postOrderTrav(root, postOrderList);
		
		for(int i=0; i < postOrderList.size(); i++)
			System.out.println(postOrderList.get(i));

	}
	
	public static void postOrderTrav(Node curr, ArrayList<Integer> postOrder) {
		
		if(curr == null)
			return;
		
		postOrderTrav(curr.left, postOrder);
		postOrderTrav(curr.right, postOrder);
		postOrder.add( curr.data);
		
	}

}

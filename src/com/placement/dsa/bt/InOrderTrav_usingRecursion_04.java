package com.placement.dsa.bt;

import java.util.ArrayList;

public class InOrderTrav_usingRecursion_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		
		ArrayList<Integer> inOrderList = new ArrayList<>();
		
		inOrder(root, inOrderList);
		
		for(int i=0; i < inOrderList.size(); i++)
			System.out.println(inOrderList.get(i));

	}
	
	public static void inOrder(Node curr, ArrayList<Integer> list) {
		
		if(curr == null)
			return;
		
		inOrder(curr.left, list);
		list.add(curr.data);
		inOrder(curr.right, list);
	}
	

}

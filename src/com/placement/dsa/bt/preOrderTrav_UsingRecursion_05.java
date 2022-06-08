package com.placement.dsa.bt;

import java.util.ArrayList;

public class preOrderTrav_UsingRecursion_05 {

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
		
		ArrayList<Integer> preOrderList = new ArrayList<>();
		
		preOrder(root, preOrderList);
		
		for(int i=0; i < preOrderList.size(); i++)
			System.out.println(preOrderList.get(i));

	}
	
	public static void preOrder(Node curr, ArrayList<Integer> list) {
		
		if(curr == null)
			return;
		
		list.add(curr.data);
		preOrder(curr.left, list);
		preOrder(curr.right, list);
	}

}

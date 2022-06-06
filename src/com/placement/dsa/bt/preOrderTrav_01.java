package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.Stack;

class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int key) {
		data = key;
		left = right = null;
	}
	
}

public class preOrderTrav_01{
	public static void main(String[] args) {
		
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
		
		ArrayList<Integer> preOrderList = new ArrayList<>();
		
		preOrderList = preOrderTrav(root);
		
		for(int i=0; i < preOrderList.size(); i++)
			System.out.println(preOrderList.get(i));
			
		
	}
	
	public static ArrayList<Integer> preOrderTrav(Node curr){
		
		ArrayList<Integer> preOrderList = new ArrayList<Integer>();
		if(curr == null)
			return preOrderList;
		
		Stack<Node> s = new Stack<>();
		s.push(curr);
		
		while( !s.empty() ) {
			Node topNode = s.peek(); //peek tells the top element of stack without removing it
			preOrderList.add(topNode.data);
			s.pop();
			
			//Preorder is root left right
			// after pushing right first, left will come on top.
			if(topNode.right != null)
				s.push(topNode.right);
			
			if(topNode.left != null)
				s.push(topNode.left);
			
			
		}
		return preOrderList;
		
	}

}

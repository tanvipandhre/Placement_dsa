package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.Stack;



public class InOrderTrav_02 {

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
		
		ArrayList<Integer> inOrderList = new ArrayList<>();
		
		inOrderList = inOrder(root);
		
		for(int i=0; i < inOrderList.size(); i++)
			System.out.println(inOrderList.get(i));
		
	

	}
	
	public static ArrayList<Integer> inOrder(Node curr){
		
		ArrayList<Integer> inOrderList = new ArrayList<>();
		
		Stack<Node> s = new Stack<>();
		
		
		
		while( true ) {
			
			if(curr != null ) { 
				s.push(curr);
				curr = curr.left;
			}else {
				if( s.isEmpty() ) 
					break;
				curr = s.peek();
				inOrderList.add(curr.data);
				s.pop();
				curr = curr.right;
			}
				
			
		}
		
		return inOrderList;
		
	}

}

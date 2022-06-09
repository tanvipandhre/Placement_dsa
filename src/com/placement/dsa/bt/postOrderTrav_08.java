package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Using one stack
public class postOrderTrav_08 {

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
		
		List<Integer> postOrderList = postOrderTrav(root);
		
		for(int i=0; i < postOrderList.size(); i++)
			System.out.println(postOrderList.get(i));
		

	}
	
	public static ArrayList<Integer> postOrderTrav(Node curr){
		
		ArrayList<Integer> postOrder = new ArrayList<>();
		Stack<Node> s = new Stack<>();
		
		if(curr == null)
			return postOrder;
		
		while(curr != null || !s.isEmpty() ) {
			if(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			else {
				Node temp = s.peek().right;
				if(temp == null) {
					temp = s.peek();
					postOrder.add(temp.data);
					s.pop();
					while(!s.isEmpty() && temp == s.peek().right) {
						temp = s.peek();
						postOrder.add(temp.data);
						s.pop();
						
					}
				}
				else {
					curr = temp;
				}
					
			}
		}
		return postOrder;
	}

}

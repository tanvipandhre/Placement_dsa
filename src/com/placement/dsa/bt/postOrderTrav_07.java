package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//using 2 stacks
public class postOrderTrav_07 {

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
		
		List<Integer> postOrderList = postOrder(root);
		
		for(int i=0; i < postOrderList.size(); i++)
			System.out.println(postOrderList.get(i));
		

	}
	public static List<Integer> postOrder(Node curr) {
		
		List<Integer> list = new ArrayList<>();
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		if(curr == null)
			return list;
		s1.push(curr);
		
		while( !s1.isEmpty() ) {
			curr = s1.pop();
			s2.push(curr);
			if(curr.left != null) 
				s1.push(curr.left);
			if(curr.right != null)
				s1.push(curr.right);
			
			
		}
		
		while(!s2.isEmpty() ) {
			list.add(s2.pop().data);
		}
		return list;
	}

}

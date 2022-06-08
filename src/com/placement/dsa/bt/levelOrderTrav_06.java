package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTrav_06 {

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
		
		List<List<Integer>> list = levelOrder(root);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}
	//for level order we use queues are elements that enter first have to be showed first
	
	public static List<List<Integer>> levelOrder(Node root){
		
		List<List<Integer>> wrapList = new ArrayList<>();
		Queue<Node> queue = new LinkedList<Node>();
		
		if(root == null)
			return wrapList;
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int levelNum = queue.size(); //size of nodes at each level 
			List<Integer> subList = new ArrayList<>();
			for(int i=0; i<levelNum; i++) {
				if(queue.peek().left != null) 
					queue.offer(queue.peek().left);
				if(queue.peek().right != null) 
					queue.offer(queue.peek().right);
				subList.add(queue.poll().data);
			}
			wrapList.add(subList);
				
		}
		return wrapList;
		
	}

}

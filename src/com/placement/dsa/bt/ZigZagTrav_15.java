package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTrav_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		ArrayList<ArrayList<Integer>> wrapList = zigzag(root);
		Iterator itr = wrapList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
	public static ArrayList<ArrayList<Integer>> zigzag(Node root){
		
		Queue<Node> queue = new LinkedList<Node>();
		ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();
		
		if(root == null) return wrapList;
		queue.offer(root);
		boolean leftToRight = true;
		
		while(!queue.isEmpty()) {
			int levelNum = queue.size();
			ArrayList<Integer> subList = new ArrayList<Integer>(levelNum);
			
			for(int i = 0; i<levelNum ; i++) {
				if(queue.peek().left != null) 
					queue.offer(queue.peek().left);
				if(queue.peek().right != null) 
					queue.offer(queue.peek().right);
				if(leftToRight)
					subList.add(queue.poll().data);
				else
					subList.add(0, queue.poll().data);
			}
			leftToRight = !leftToRight;
			wrapList.add(subList);
			
		}
		
		return wrapList;
		
	}

}

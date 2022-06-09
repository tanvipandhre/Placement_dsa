package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair{
	Node node;
	int num;
	public Pair(Node no, int i) {
		this.node = no;
		this.num = i;
	}
}

public class PreInPostOrderTrav_09 {

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
		
		List<Integer> pre = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		
		preInPostOrderTrav(root, pre, in , post);
		
		System.out.println("Pre order traveral of BT");
		for(int i=0; i < pre.size(); i++)
			System.out.print(pre.get(i) + " ");
		System.out.println();

		System.out.println("Inorder traveral of BT");
		for(int i=0; i < in.size(); i++)
			System.out.print(in.get(i) + " ");
		System.out.println();
		
		System.out.println("Post order traveral of BT");
		for(int i=0; i < post.size(); i++)
			System.out.print(post.get(i) + " ");
		System.out.println();

	}
	
	public static void preInPostOrderTrav(Node root, List<Integer> pre, List<Integer> in, List<Integer> post) {
		Stack<Pair> s = new Stack<>();
		s.push(new Pair(root, 1));
		
		
		if(root == null)
			return;
		
		while( !s.isEmpty() ) {
			Pair p = s.pop();
			
			if(p.num == 1) {
				pre.add(p.node.data);
				p.num++;
				s.push(p);
				
				if( p.node.left != null)
					s.push(new Pair(p.node.left, 1));
				
				
			}else if(p.num == 2) {
				in.add(p.node.data);
				p.num++;
				s.push(p);
				
				if( p.node.right != null)
					s.push(new Pair(p.node.right, 1));
				
			}else if(p.num == 3) {
				post.add(p.node.data);
			}
		}
		
	}

}

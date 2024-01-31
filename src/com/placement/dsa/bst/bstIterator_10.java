package com.placement.dsa.bst;

import java.util.Stack;

public class bstIterator_10 {
	private static Stack<Node> stack = new Stack<Node>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public bstIterator_10(Node root) {
		pushAll(root);
	}
	public static boolean hasNext() {
		return !stack.isEmpty();
	}
	public static int next() {
		Node tmp = stack.pop(); // root node gets pop
		pushAll(tmp.right); //pushes all the left elements of the right element
		return tmp.data;
		
	}
	public static void pushAll(Node node) {
		for(;node != null; stack.push(node), node = node.left); //pushes all left nodes
	}

}

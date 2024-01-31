package com.placement.dsa.bst;
//two nodes are swap
public class recoverBst_12 {
	static Node first;
	static Node middle;
	static Node last;
	static Node previous;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void recoverTree(Node root) {
		first = middle = last = null;
		previous = new Node(Integer.MIN_VALUE);
		inorder(root);
		//if there are 2 violations, then swap first and last --> nodes to swapped are not adjacent
		if( first != null && last !=null ) {
			int tmp = first.data;
			first.data = last.data;
			last.data = tmp;
		}
		//if there is one violation -- nodes to be swapped are adjacent
		else if( first !=null && middle != null) {
			int tmp = first.data;
			first.data = middle.data;
			middle.data = tmp;
		}
	}
	public static void inorder(Node node) {
		if( node == null )
			return;
		inorder( node.left); //left
		//violation condition //root
		if( previous != null && previous.data > node.data) {
			//if this is a first violation than mark first and middle
			if( first == null) {
				first = previous;
				middle = node;
			}
			//second violation
			else
				last = node;
			
		}
		//mark this node as previous
		previous = node;
		
		
	}

}

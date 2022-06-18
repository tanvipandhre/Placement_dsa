package com.placement.dsa.bt;

public class SameTree_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node p = new Node(1);
		p.left = new Node(2);
		p.right = new Node(3);
		
		Node q = new Node(1);
		q.left = new Node(2);
		//q.right = new Node(3);
		
		System.out.println("Are trees same? "+isSameTree(p, q));

	}
	public static boolean isSameTree(Node p, Node q) {
		if(p == null || q == null)
			return p==q;
		return (p.data == q.data) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right); //preOrder Traversal same
	}

}

package com.placement.dsa.bst;

public class LowestCommonAncestor_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(4);
		root.right = new Node(13);
		root.left.left = new Node(3);
		root.left.right = new Node(8);
		root.right.left = new Node(11);
		root.right.right = new Node(15);
		root.left.left.left = new Node(1);
		root.left.left.left.right = new Node(2);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(9);
		Node lca1 = lca(root, root.left.right.left, root.left.right.right); //6 9
		System.out.println(lca1.data);
		

	}
	public static Node lca(Node root, Node p, Node q) {
		if(root == null)
			return null;
		int curr = root.data;
		//ya to dono node right me hoge
		if(curr < p.data && curr < q.data)
			return lca( root.right, p, q);
		//ya to dono node left me hoge
		if(curr > p.data && curr > q.data)
			return lca( root.left, p, q);
		//if that root node is only searched node;
		return root;
		
	}

}

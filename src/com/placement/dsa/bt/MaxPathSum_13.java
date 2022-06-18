package com.placement.dsa.bt;

public class MaxPathSum_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root = new Node(-10);
		 root.left = new Node(9);
		 root.right = new Node(20);
		 root.right.left = new Node(15);
		 root.right.right = new Node(7);
		 int sum = maxPathSum(root);
		 System.out.println("Max Path Sum is "+ sum);

	}
	public static int maxPathSum(Node root) {
		int maxValue[] = new int[1];
		maxValue[0] = Integer.MIN_VALUE;
		maxPathDown(root,maxValue);
		return maxValue[0];
	}
	
	public static int maxPathDown(Node root, int[] maxValue) {
		if(root == null) 
			return 0;
		int lh = Math.max(0, maxPathDown(root.left, maxValue)); // by doing math.mx with 0 here, it avoids all numbers w 0.
		int rh = Math.max(0, maxPathDown(root.right, maxValue));
		maxValue[0] = Math.max(maxValue[0], lh+rh+root.data);
		return root.data + Math.max(lh, rh);
	}

}

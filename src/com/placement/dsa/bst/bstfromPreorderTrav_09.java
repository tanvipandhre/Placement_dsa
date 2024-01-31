package com.placement.dsa.bst;

public class bstfromPreorderTrav_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public static Node bstFromPreorder(int[] A) {
		return bstFromPreorder(A, new int[] {0}, Integer.MAX_VALUE);//at first upper bound is int max and arr has 0 that is pointing to the root
	}
	public static Node bstFromPreorder(int[] A,  int[] i, int bound) { // arr i is the pointer array // arr A is the preorder array  
		//arr has covered al elements            //reached leaf and node to be found is not in this direction
		if( i[0] == A.length                 ||     A[i[0]] > bound)
			return null;
		Node root = new Node(A[i[0]++]);
		//left ka bound root rhta he
		root.left = bstFromPreorder(A, i, root.data);
		//right ka boung upper bound hota he
		root.right = bstFromPreorder(A, i, bound);
		return root;
				
			
	}

}

package com.placement.dsa.bst;

import java.util.Stack;

public class twoSumBstIterator_11 {
	private static Stack<Node> stack = new Stack<Node>();
	private static boolean reverse = true;
	//reverse true --> before
	//reverse false -->  next
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public twoSumBstIterator_11(Node root, boolean isReverse) {
		reverse = isReverse;
		pushAll(root);
	}
	public static void pushAll(Node node) {
		while(node != null) {
			stack.push(node);
			if(reverse)
				node = node.right;//push all right when before
			else
				node = node.left; //push all left when next
			
		}
	}
	public static boolean hasNext() {
		return !stack.isEmpty();
	}
	public int next() {
		Node tmp = stack.pop();
		if( !reverse ) {//next
			pushAll(tmp.right);
		}else
			pushAll(tmp.left);
		return tmp.data;
	}

}

class twoSum{
	public static boolean isTwoSum(Node root, int k) {
		if(root == null)
			return false;
		twoSumBstIterator_11 l = new twoSumBstIterator_11(root, false);
		twoSumBstIterator_11 r = new twoSumBstIterator_11(root, true);
		
		int i = l.next();
		int j = r.next();
		while(i < j) {
			if(i + j == k)
				return true;
			else if(i + j < k)
				i = l.next();
			else
				j = r.next();
			
				
		}
		return false;
	}
}

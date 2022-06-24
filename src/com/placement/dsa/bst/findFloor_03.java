package com.placement.dsa.bst;

public class findFloor_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.left.right.left = new Node(6);
		root.right.left = new Node(13);
		root.right.right = new Node(17);
		
		int floor = findFloor(root, 7);
		System.out.println(floor);
		

	}
	public static int findFloor(Node root, int key) {
		int floor = -1;
		while(root != null) {
			if(root.data == key) {
				floor = root.data;
				return floor;
			}
			if(key > root.data) { 
				floor = root.data;// greatest no jo floor ho isliye right wala
				root = root.right;
			}
			else
				root = root.left;
				
		}
		return floor;
	}

}

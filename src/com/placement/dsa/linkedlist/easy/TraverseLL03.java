package com.placement.dsa.linkedlist.easy;

public class TraverseLL03 {
	public static void print(Node head) {
		
		Node mover = head;
		while(mover!=null) {
			System.out.println(head.data);
			mover = mover.next;
		}
	}
	
}

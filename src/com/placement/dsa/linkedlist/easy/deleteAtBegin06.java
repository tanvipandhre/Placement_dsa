package com.placement.dsa.linkedlist.easy;

public class deleteAtBegin06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node delAtBegin(Node head) {
		if( head == null || head.next == null) {
			return null;
		}
		else 
			head = head.next;
		return head;
	}

}

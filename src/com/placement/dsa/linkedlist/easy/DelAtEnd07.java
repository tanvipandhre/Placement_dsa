package com.placement.dsa.linkedlist.easy;

public class DelAtEnd07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node delAtEnd(Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		else {
			Node curr = head;
			while( curr.next.next != null) curr = curr.next;
			curr.next = null;
		}
		return head;
	}
}

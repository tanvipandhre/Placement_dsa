package com.placement.dsa.linkedlist.easy;

public class insertionAtAnyPosition05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node insertAtPos(Node head, int pos, int data) {
		Node temp = new Node(data);
		if(pos == 1) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		for(int i=1; i<= pos-2; i++) curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		return head;	
	}

}

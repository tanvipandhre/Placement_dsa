package com.placement.dsa.linkedlist.easy;

public class insertionAtEnd04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Node insertAtEnd(Node list, int newValue) {
        // Write your code here
        Node last = new Node(newValue);
        if(list == null) return last;
        Node mover = list;
        while(mover.next != null) {
        	mover = mover.next;
        }
        mover.next = last;
        
        return list;
    }

}

package com.placement.dsa.linkedlist.easy;

public class convertArrToLL01 {
	public static Node constructLL(int []arr) {
        // Write your code here
        
        Node head = new Node(arr[0]);
        //creating a reference node mover pointing to head
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp; 
        }
        return head;
    }
}

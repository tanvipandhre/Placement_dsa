package com.placement.dsa.linkedlist.easy;
import java.util.Stack;
public class ReverseLL10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Naive - introducing stack
	//time - O(2N) space - O(N) stack space
	public static Node reverseLinkedList_naive(Node head)
    {
        // Write your code here.
        Node curr = head;
        Stack<Integer> st = new Stack<Integer>();
        while(curr != null){
            st.push(curr.data);
            curr = curr.next;
            
        }
        curr = head;
        while(curr!=null){
            curr.data = st.pop();
            curr = curr.next;
        }
        return head;
    }
	
	//iterative method - using prev and front as two new pointers and changing the direction
	//time - O(N) one pass space - O(1)
	public static Node reverseLinkedList_iteraive(Node head)
    {
        // Write your code here.
        Node curr = head;
        Node prev = null;
        Node front = null;
        while(curr != null ){
            front = curr.next;
            curr.next = prev;            
            prev = curr;
            curr = front;
            
        }
        return prev;
    }
	//recursive -  
	//time - O(N) space - O(N) 
	public static Node reverseLinkedList_recursion(Node head)
    {
        // Write your code here.
        
        if(head == null || head.next== null) return head;
        Node newHead = reverseLinkedList_recursion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;


    }
	
	

}

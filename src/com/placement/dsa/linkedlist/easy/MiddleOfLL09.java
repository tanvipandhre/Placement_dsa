package com.placement.dsa.linkedlist.easy;

public class MiddleOfLL09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Naive - count no of nodes and finding middle
	 public static Node findMiddle(Node head)
	    {
	        // Write your code here.
	        if(head == null || head.next == null) return head;
	        int count = 0;
	        Node curr = head;
	        while(curr != null){
	            count++;
	            curr = curr.next;
	        }
	        //System.out.println("No of nodes"+count);
	        Node temp = head;
	        int mid = (count/2) + 1;
	        //System.out.println("mid value"+mid);
	        for(int i=1;i<mid;i++){
	            temp = temp.next;
	        }
	        return temp;

	    }
	 //Tortoise and Hare algorithm
	 public static Node findMiddle_tortoise(Node head)
	    {
	        // Write your code here.
	        if(head == null || head.next == null) return head;
	        Node slow = head;
	        Node fast = head;
	        while(fast!=null && fast.next!=null){
	            //if(fast.next.next != null)
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        return slow;

	    }

}

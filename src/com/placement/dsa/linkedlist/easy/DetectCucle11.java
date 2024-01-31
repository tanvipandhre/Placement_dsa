package com.placement.dsa.linkedlist.easy;

import java.util.HashSet;

public class DetectCucle11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean detectCycle(Node head) {
        //Your code goes here
        
        //solution - using hashing
         HashSet <Node> mpp = new HashSet<>();
         Node temp = head;

        while(temp != null){

            if(mpp.contains(temp)) return true;

            mpp.add(temp);

            temp = temp.next;

        }

        return false;
       
    }
    
    public static boolean detectCycle_pointers(Node head) {
    	//solution 2- using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;

        }
        return false;
    }
    


}

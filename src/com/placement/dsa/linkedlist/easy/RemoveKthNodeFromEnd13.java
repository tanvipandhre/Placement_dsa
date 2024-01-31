package com.placement.dsa.linkedlist.easy;

public class RemoveKthNodeFromEnd13 {
	public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(head == null) return null;
        
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(K == count) return head.next;
        Node temp2 = head;
        int res = count - K;

        while(temp2 != null){
            res--;
            if(res == 0) break;
            temp2 = temp2.next;

        }

        Node delNode = temp2.next;
        temp2.next = temp2.next.next;
        delNode = null;
        return head;
    }
}

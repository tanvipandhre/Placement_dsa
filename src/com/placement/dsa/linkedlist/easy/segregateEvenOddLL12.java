package com.placement.dsa.linkedlist.easy;

public class segregateEvenOddLL12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.
        if(head == null || head.next == null) return head;
        Node oddHead = new Node(-7);
        Node evenHead = new Node(-7);

        Node oDriver = oddHead;
        Node eDriver = evenHead;

        Node temp = head;

        while(temp != null) {
            if(temp.data % 2 == 0) {
                eDriver.next = temp;
                eDriver = eDriver.next;
            } else {
                oDriver.next = temp;
                oDriver = oDriver.next;
            }

            temp = temp.next;

        }
        eDriver.next = oddHead.next;
        oDriver.next = null;

        return evenHead.next;

    }

}

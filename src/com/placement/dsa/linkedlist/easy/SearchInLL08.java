package com.placement.dsa.linkedlist.easy;

public class SearchInLL08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int SearchInLL_Iterative(Node head, int key) {
		int pos = 1;
		Node curr = head;
		
		while(curr!=null) {
			if(curr.data == key) {
				
				return pos;
			}
			else {
				pos++;
				curr = curr.next;
			}
		}
		return -1;
		
	}
	public static int SearchInLL_Recursive(Node head, int key) {
		if(head == null) return -1;
		if(head.data == key) return 1;
		else {
			int res = SearchInLL_Recursive(head.next, key);
			if(res == -1) return -1;
			else return (res+1);
		}
		
	}
}
 
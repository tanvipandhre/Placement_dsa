package com.placement.dsa.leetcode.sdesheet.day1;

import java.util.List;
/*
 * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []

Input: list1 = [], list2 = [0]
Output: [0]

linkz is pointing to linky
 */
 
public class MergeTwoLinkedList {
	List linky = null;
    ListNode linkz = linky;

    ListNode list11 = list1;
    ListNode list22 = list2;

    if((list11!=null) && (list22!=null)){
        if(list11.val<list22.val){
            
            linky = new ListNode (list11.val );
            linkz = linky;
            list11 = list11.next;
        }
        else if(list22.val<list11.val){
            
            linky = new ListNode (list22.val );
            linkz = linky;list22= list22.next;
        }
        else{
            
            linky = new ListNode (list11.val );
            linkz = linky;list11=list11.next;

        }
    }
    else if ((list1 == null) && (list2 ==null)){
        return null;
    }


    else if (list1 == null){
        return list2;
    }
    else{
        return list1;
    }

    while(true){
        if((list11!=null) && (list22!=null)){
        if(list11.val<list22.val){
            linky.next = new ListNode (list11.val );
            list11 = list11.next;
            linky = linky.next;
        
        }
        else if(list22.val<list11.val){
            linky.next = new ListNode (list22.val );
            list22 = list22.next;
            linky = linky.next;

        }
        else{
            linky.next = new ListNode (list11.val );
            list11 = list11.next;
            linky = linky.next;

        }
    }
    else if ((list11 == null) && (list22 ==null)){
        return linkz;
    }


    else if (list11 == null){
        linky.next = new ListNode(list22.val);
        list22 = list22.next;
        linky = linky.next;
    }
    else{
        linky.next = new ListNode(list11.val);
        list11 = list11.next;
        linky = linky.next;
    }
    }
}
}

package com.placement.dsa.stacks.easy;

public class ArraysToStack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int[] s;
    int top;
    ArraysToStack1(int capacity) {
        // Write your code here.
        s = new int[capacity];
        top = -1;
    }
    public void push(int num) {
        // Write your code here.
        if(top==s.length-1) return;
        ++top;
        s[top] = num;
    }
    public int pop() {
        // Write your code here.
        if(top==-1) return -1;
        return s[top--];
    }
    public int top() {
        // Write your code here.
        if(top==-1) return -1;
        return s[top];

    }
    public int isEmpty() {
        // Write your code here.
        return (top==-1)?1:0;
    }
    public int isFull() {
        // Write your code here.
        return (top==s.length-1)?1:0;
    }


}

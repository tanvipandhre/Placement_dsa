package com.placement.dsa.recursion;

public class Recursion01 {
	static int  count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}
	public static void print() {
		
		if(count == 4)
			return;
		System.out.println(count);
		count++;
		print();
		
		
	}

}

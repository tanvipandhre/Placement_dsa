package com.placement.dsa.recursion.basic;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3,'a','b','c');
	}
	public static void toh(int n, char a, char b, char c) {
		if(n==1) {
			System.out.println("Move disk "+n+"from "+a+"to "+c);
			return;
		}
		
		toh(n-1,a,c,b);
		System.out.println("Move disk "+n+"from "+a+"to "+c);
		toh(n-1,b,a,c);
	}

}

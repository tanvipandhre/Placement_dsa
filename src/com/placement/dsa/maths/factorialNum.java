package com.placement.dsa.maths;

public class factorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int result = factorial_norm(n);
		System.out.println(result);
	}
	//time - O(n) since function is called n times,  space - O(n) is the stack space 
	public static int factorial(int n) {
		
		if(n==0)
			return 1;
		
			
		return n*factorial(n-1);
	}
	
	//time - O(n) space - O(1)
	public static int factorial_norm(int n) {
		if(n==0)
			return 1;
		else {
			int fact = 1;
			for(int i = n;i>=1;i--) {
				fact = fact * i;
			}
			return fact;
		}
	}
	

}

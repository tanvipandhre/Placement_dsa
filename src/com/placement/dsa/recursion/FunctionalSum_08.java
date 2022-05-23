package com.placement.dsa.recursion;

import java.util.Scanner;

public class FunctionalSum_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		System.out.println("Sum is "+printSum(n));

	}
	public static int printSum(int n) {
		if(n==0)
			
			return 0;
		else
			return n + printSum(n-1);
		
	}

}

package com.placement.dsa.recursion;

import java.util.Scanner;

public class PrintNumNTo1_04 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		//printNum( n, 1);
		printNum(n, n);

	}
	/*public static void printNum(int n, int i) {
		
		if(n < i)
			return;
		System.out.println(n);
		n--;
		printNum(n,i);
					
	}*/
	
	public static void printNum(int i, int n) {

		 if(i < 1) 
			 return;
		 System.out.println(i);
		 printNum(i-1, n);
	}
}

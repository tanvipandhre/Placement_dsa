package com.placement.dsa.recursion;

import java.util.Scanner;

public class PrintTillN_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		printNum(1, n);

	}
	public static void printNum(int i, int n) {
		
		if(i > n)
			return;
		System.out.println(i);
		
		printNum(i+1, n);
					
	}

}

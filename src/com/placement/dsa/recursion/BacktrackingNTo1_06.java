package com.placement.dsa.recursion;

import java.util.Scanner;

public class BacktrackingNTo1_06 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		printNum(1,n);

	
	}
	public static void printNum(int i, int n) {
		if(i > n)
			return;
		printNum(i+1,n);
		System.out.println(i);
	}
}

package com.placement.dsa.recursion;

import java.util.Scanner;

public class RecursionPrintName02 {

	static int  count = 0;
	static String name= "Tanvi";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		printName(1,n);

	}
	public static void printName(int i, int n) {
		
		if(i>n)
			return;
		System.out.println(name);
		
		printName(i+1, n);
		
		
	}



}

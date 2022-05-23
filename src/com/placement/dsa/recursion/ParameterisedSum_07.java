package com.placement.dsa.recursion;

import java.util.Scanner;

public class ParameterisedSum_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		printSum(n, 0);

	}
	public static void printSum(int i, int sum) {
		if(i < 1)
			return;
		//sum += i;
		System.out.println("i= "+i+" sum = "+sum);
		printSum(i-1,sum+i);
		
	}

}

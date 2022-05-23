package com.placement.dsa.recursion;

import java.util.Scanner;

public class FunctionalFactorial_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		System.out.println("Factorial of n is "+factorial(n));

	}
	public static int factorial(int i) {
		if(i == 1)
			return 1;
		else
			return i * factorial(i-1);
			
	}

}

package com.placement.dsa.recursion;

import java.util.Scanner;

public class Fibonacci_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no whose fibo num you want");
		int n = sc.nextInt();
		int fibo = fibonacci(n);
		System.out.println("Fibo num "+fibo);
	}
	public static int fibonacci(int n) {
		if(n <= 1)
			return n;
		else {
			System.out.println("last = "+fibonacci(n-1)+" sec last = "+fibonacci(n-2));
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}

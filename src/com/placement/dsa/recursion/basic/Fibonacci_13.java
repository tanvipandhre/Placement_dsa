package com.placement.dsa.recursion.basic;

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
	//time- o(n) space - O(n)
	public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] res = new int[n];
        if(n==1) res[0]=0;
        else {
            res[0] = 0;
            res[1] = 1;
            for(int i = 2; i<n;i++)
                res[i] = res[i-1] + res[i-2];
        }
        return res;
    }
	

}

package com.placement.dsa.maths;

public class printDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllDivisors_optimal(36);
	}
	//time - O(n) space - O(1)
	public static void printAllDivisors_brute(int n) {
		for(int i = 1;i<n; i++) {
			if(n%i==0) System.out.println(i);
		}
	}
	//time - O(sqrt n) space - O(1)
	public static void printAllDivisors_optimal(int n) {
		for(int i = 1;i<(int)Math.sqrt(n); i++) {
			if(n%i==0) {
				System.out.println(i);
				if(i!=n/i) System.out.println(n/i);
			}
		}
	}
	
	
}

package com.placement.dsa.maths;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = isPrime_optimized(15);
		System.out.println(isPrime);
	}
	//time limit exceed
	//1 is not prime 
	//time - O(N) space - O(1)
	//prime is which has only 2 factors 1 and number itself
	public static String isPrime_brute(int num) {
		//Your code goes here
		int count = 0;
		for(int i = 1; i<=num; i++){
			if(num%i==0) count++;
		}
		if(count>2 || num == 1) return "NO";
		else return "YES";
	}
	
	//check for loop till sqrt n
	//time - O(sqrt n) space - O(1)
	public static boolean isPrime_optimized(int n) {
		//Your code goes here
		if(n==1) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) return false; 
		}
		return true;
		
	}
	
}

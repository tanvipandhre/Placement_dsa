package com.placement.dsa.maths;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactors_optimize(12);
	}
	public static boolean isPrime(int n) {
		
		int count = 0;
		for(int i = 1; i<=n; i++){
			if(n%i==0) count++;
		}
		if(count>2 || n == 1) return false;
		else return true;
		
	}
	public static void primeFactors_brute(int n) {
		for(int i=2;i<=n; i++) {
			if(isPrime(i)) {
				int x=i;
				while(n%x==0) {
					System.out.println(i);
					x=x*i;
					
				}
				
			}
		}
	}
	
	public static void primeFactors_optimize(int n) {
		if(n<=1) return;
		for(int i = 2;i*i<n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
				
			}
		}
		if(n>1)
			System.out.println(n);
	}
	

}

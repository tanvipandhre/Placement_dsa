package com.placement.dsa.maths;

public class gcdNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//time-O(n) space - O(1)
	public static int calcGCD_brute(int n, int m){
        // Write your code here.
        int max = Math.min(n,m);
        int gcd = 1;
        for(int i = 1; i<=max; i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
	
	//recursion
	
	 public static int calcGCD_optimize(int n, int m){
        // Write your code here.
        if(m==0)    return n;

        return calcGCD_optimize(m, n%m);


    }

}

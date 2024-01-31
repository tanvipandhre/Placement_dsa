package com.placement.dsa.recursion.basic;

public class ropeCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfCuts = ropeCuts(23,9,11,12);
		System.out.println(noOfCuts);
	}
	public static int ropeCuts(int n, int a, int b, int c) {
		if(n==0) return 0;
		if(n<0) return -1;
		int res = Math.max(ropeCuts(n-a, a, b, c), ropeCuts(n-b, a, b, c));
		int res1 = Math.max(res, ropeCuts(n-c, a, b, c));
		if(res1==-1) return -1;
		return res1+1;
	}

}

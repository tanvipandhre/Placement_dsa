package com.placement.dsa.recursion;

import java.util.ArrayList;

public class CountSubsequenceSumK_17 {
	/*
	 * base condition satisfy --> return 1
	 * base condition not satisfy --> return 0
	 * 
	 * l = f()
	 * r = f()
	 * 
	 * l+r
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int n = 3; // size
		int k = 2; // expected sum
		
		int num = countSubsequenceWithSumk(0, 0, k, arr, n);
		System.out.println(num);
		

	}
	public static int countSubsequenceWithSumk(int i,  int s, int sum, int[] arr, int n) {
		
		//time complexity can be reduced 
		//can be done only array contains positives only
		if(s > sum) return 0;
		if(i>=n) {
			if(s == sum) {
				return 1;
				
			}
			return 0;
			
		}
		else {
			
			s += arr[i];
			int l = countSubsequenceWithSumk(i+1,  s, sum, arr, n);
			
			
			s -= arr[i];
			int r = countSubsequenceWithSumk(i+1, s, sum, arr, n);
			return l+r;
		}
		
	}

}

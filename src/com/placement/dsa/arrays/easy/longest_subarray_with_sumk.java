package com.placement.dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class longest_subarray_with_sumk {
	//subarray has consecutive nums
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,1,9};
		int n = 5;
		int k = 10;
		int len = longest_subarray_sol1(arr,n, k);
		System.out.println("Longest subarray with sum k has length using 3 loops = "+len);
		int len2 = longest_subarray_sol2(arr,n, k);
		System.out.println("Longest subarray with sum k has length using 2 loops = "+len2);
				
	}
	//sol 1 - 3 loops
	//time O(N^3)
	//space - O(1)
	public static int longest_subarray_sol1(int[] arr, int n, int k) {
		int len=0;
		for(int i = 0;i<n; i++) { //start index
			for(int j=i;j<n; j++) { //end index //generate subarrays 
				long s = 0;
				for(int m = i;m<=j; m++) {
					s += arr[m]; 
				}
				if(s==k)
					len = Math.max(j-i+1, len);
			}
		}
		return len;
	}
	//sol2 - 2 loops
	//time O(N^2)
	//space - O(1)
	public static int longest_subarray_sol2(int[] arr, int n, int k) {
		int len = 0;
		for(int i = 0;i<n; i++) {
			long s=0;
			for(int j=i;j<n;j++) {
				s += arr[j];
				if(s==k) {
					len = Math.max(j-i+1, len);
				}
			}
		}
		return len;
	}
	
	
	
	//sol3 - 2 pointers
	public static int longest_subarray_sol4(int[] arr, int n, int k) {
		int maxLen = 0;
		int l = 0, r = 0;
		while(r<n) {
			
		}
		return maxLen;
	}
	

}

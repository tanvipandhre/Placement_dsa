package com.placement.dsa.arrays.easy;

import java.util.Arrays;

public class second_smallest_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,7,8,2};
		int n = arr.length;
		//getElements(arr,n);
		int sec_small = secondSmallest(arr, n);
		System.out.println("Second smallest element is "+ sec_small);
	}
	//Bruteforce sorting
	/*
	public static void getElements(int[] arr, int n) {
		if(n==0 || n==1) {
			System.out.println("-1");
			
		}
		Arrays.sort(arr);
		System.out.println("Second smallest element"+arr[1]);
		System.out.println("Second largest element"+arr[n-2]);
		
	}
	*/
	//Better approach not use sorting and get ans in single traversal
	//Time complexity O(n) with 2 traversals
	/*
	public static void getElements(int[] arr, int n) {
		if(n==0 || n==1) {
			System.out.println("-1");
			
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		
		for(int i = 0; i<n ; i++) {
			small = Math.min(small, arr[i]);
			large = Math.max(large, arr[i]);
		}
		for(int i = 0;i<n; i++) {
			if(arr[i] < second_small && arr[i] != small)
				second_small  = arr[i];
			if(arr[i] > second_large && arr[i] != large)
				second_large = arr[i];
				
		}
		System.out.println("Second smallest = "+second_small);
		System.out.println("Second largest = "+second_large);
		
		
	}*/
	
	//optimal approach if current element is smaller than small update second_small and small
	//else if current element is smaller than second_small and not equal to small then update second_small
	private static int secondSmallest(int[] arr, int n) {
		if(n < 2)
			return -1;
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		for(int i = 0; i<n; i++) {
			if(arr[i] < small) {
				second_small = small;
				small = arr[i];
			}
			else if(arr[i] < second_small && arr[i] != small) {
				second_small = arr[i];
			}
		}
		return second_small;
	}
	
	
	
}

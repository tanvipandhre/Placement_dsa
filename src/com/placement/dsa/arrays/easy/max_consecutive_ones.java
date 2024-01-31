package com.placement.dsa.arrays.easy;

public class max_consecutive_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,0,1,1,1};
		int max_ones = max_cons_ones(arr);
		System.out.println("Max consecutive 1's are"+max_ones);
		
		
	}
	public static int max_cons_ones(int[] arr) {
		int count = 0;
		int maxcount = 0;
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i] == 1) {
				count++;
			}else {
				count=0;
			}
		}
		maxcount = Math.max(count, maxcount);
		return maxcount;
	}
}

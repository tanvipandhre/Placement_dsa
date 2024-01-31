package com.placement.dsa.arrays.easy;

public class maxDifferenceWithOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Naive
	public static int maxDifference(int[] arr, int n) {
		int res = arr[1] - arr[0];
		for(int i = 0; i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				res = Math.max(res, arr[j] - arr[i]);
			}
		}
		return res;
	}
	//optimal
	
	public static int maxDifference_optimal(int[] arr, int n) {
		int res = arr[1] - arr[0];
		int min = arr[0];
		for(int i = 0; i<n; i++) {
			
				res = Math.max(res, arr[i]-min);
				min = Math.min(min, arr[i]);
			
		}
		return res;
	}

}

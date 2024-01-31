package com.placement.dsa.arrays.easy;

public class LongestEvenOddSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	//Brute
	//we see all the subarrays
	public static int oddEvenSubarray_brute(int[] arr, int n) {
		int res = 1;
		for(int i=0;i<n;i++) {
			int curr = 1;
			for(int j=i+1;j<n;j++) {
				if((arr[j]%2==0 && arr[j-1]%2 != 0) || (arr[j]%2!=0 && arr[j-1]%2 == 0)) curr++;
				else break;
			}
			res = Math.max(curr, res);
		}
		return res;
	}

}

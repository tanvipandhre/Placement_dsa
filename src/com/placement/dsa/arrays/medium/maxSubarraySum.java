package com.placement.dsa.arrays.medium;

public class maxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static long maxSubarraySum_brute(int[] arr, int n) {
		// write your code here
		
		int maxSum = 0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum += arr[k];
				}
				maxSum = Math.max(sum, maxSum);
			}
		}
		return maxSum;
	}
	//Kadane's algorithm
	public static long maxSubarraySum_optimal(int[] arr, int n) {
		// write your code here

		long maxSum = arr[0];
		long sum = 0;
		for(int i = 0; i<n; i++){

			sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            
            if (sum < 0) {
                sum = 0;
            }
			
		}
		if(maxSum<0) maxSum=0;
		return maxSum;
	}

}

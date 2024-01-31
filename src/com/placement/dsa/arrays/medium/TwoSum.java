package com.placement.dsa.arrays.medium;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,8,5,4};
		int target = 14;
		
		System.out.println("two sum indices are");
		twoSum(arr, target);
	}
	public static void twoSum(int[] arr, int target) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length ; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
				}
			}
			
		}
		
	}

}

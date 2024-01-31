package com.placement.dsa.arrays.easy;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void printFreq(int[] arr, int n) {
		int freq = 1, i=1;
		while(i<n) {
			while(i<n && arr[i-1]==arr[i]) {
				freq++;
				i++;
			}
			System.out.println("arr[i]= "+arr[i]+" freq="+freq);
			i++;
			freq=1;
		}
		//corner cases
		if(n==1 || arr[n-1] != arr[n-2]) {
			System.out.println("arr[i]= "+arr[i]+" freq=1");
		}
		
		
	}
	

}

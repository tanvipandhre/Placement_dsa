package com.placement.dsa.arrays.easy;

import java.util.Arrays;

public class largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,7,2,3};
		//find the largest element
		//BruteForce
		/*
		Arrays.sort(arr);
		System.out.println("Largest element "+arr[arr.length -1]);
		*/
		
		//optimal approach max variable 
		int max = arr[0];
		for(int i = 0; i < arr.length ; i++) {
			if( max < arr[i])
				max = arr[i];
			
		}
		System.out.println("Largest element max  = "+max);
		
	}
	

}

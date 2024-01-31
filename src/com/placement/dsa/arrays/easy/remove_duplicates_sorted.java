package com.placement.dsa.arrays.easy;

import java.util.HashSet;

public class remove_duplicates_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to remove duplicates from sorted array
		int[] arr = {1,1,1,2,2,3,3,3,3};
		int k = remove_duplicates_sortedd(arr);
		System.out.println("After removing duplicates from sorted array");
		for(int i = 0;i<k; i++) {
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}
	//Bruteforce - HashSet 
	//Time complexity O(nlogn) +O(n)
	/*
	public static int remove_duplicates_sortedd(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i<arr.length ; i++) {
			set.add(arr[i]);
		}
		int k = set.size();
		int j = 0;
		for(int x : set) {
			arr[j++] = x;
		}
		return k;
	}
	*/
	
	//optimal - 2 pointers
	//Time - O(n)
	public static int remove_duplicates_sortedd(int[] arr) {
		int i = 0;
		
			for(int j = 1;j<arr.length; j++) {
				if(arr[i]!=arr[j]) {
					i++;
					arr[i] = arr[j];
				}
			}
		return i+1;
	}
	
	

}

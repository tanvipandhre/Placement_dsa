package com.placement.dsa.arrays.easy;

public class is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6, 7};
		System.out.println("Is the array sorted? "+ isSorted(arr));
		
	}
	//Brutforce
	/*
	public static boolean isSorted(int[] arr) {
		
		for(int i=0 ; i<arr.length; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	*/
	//optimal check the previous number 
	public static boolean isSorted(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]  < arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}

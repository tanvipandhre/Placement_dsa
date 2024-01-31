package com.placement.dsa.arrays.easy;

public class move_zeros_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,0,1,0,0,4};
		int n = arr.length;
		int[] temp = moving_zeros_to_end(arr,n);
		System.out.println("Array after moving all zeros to the end");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+temp[i]);
		}
		System.out.println();
	}
	//Bruteforce - identifying Time O(2n) and space - O(n) because of the temp array
	/*
	public static void moving_zeros_to_end(int[] arr, int n) {
		int[] temp = new int[n];
		int k=0;
		for(int i=0;i<n; i++) {
			if(arr[i]!=0) {
				temp[k++] = arr[i];
				
			}
		}
		System.out.print("Temp array");
		for(int i=0;i<k;i++) {
			
			System.out.print(" "+temp[i]);
		}
		
		for(int i = 0; i<n; i++) {
			if(temp[i]!=0) {
				arr[i] = temp[i];
			}else {
				arr[i] = 0;
			}
			
		}
	}*/
	
	//optimal - 2 pointers Time - O(n) space - O(1)
	public static int[] moving_zeros_to_end(int[] arr, int n) {
		int j = -1;
		for(int i = 0;i<n; i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1)
			return arr;
		//if a[i] !=0 then swap i and j and increment both of them.
		for(int i = j+1; i<n ; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		
		return arr;
		
	}
	

}

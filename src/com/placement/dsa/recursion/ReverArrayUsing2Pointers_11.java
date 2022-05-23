package com.placement.dsa.recursion;

import java.util.Scanner;

public class ReverArrayUsing2Pointers_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter digit for "+i+" position");
			arr[i] = sc.nextInt();
		}
		reverseArray(0, arr, n-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void reverseArray(int l, int[] arr, int r) {
		if(l >= r)
			return;
		else {
			int temp = 0 ;
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			reverseArray(l+1, arr, r-1);
		}
	}

}

package com.placement.dsa.recursion;

import java.util.Scanner;

public class ReverseArray_10 {

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
		reverseArray(0, arr, n);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void reverseArray(int i , int[] arr, int n) {
		int temp=0;
		if(i >= (n/2))
			return ;
		else {
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
			reverseArray(i+1, arr, n);
		}
	}
	
}

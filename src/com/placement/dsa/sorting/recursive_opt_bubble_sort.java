package com.placement.dsa.sorting;

public class recursive_opt_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		
		System.out.println("before recursive bubble sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubble_sortt(arr, arr.length);
		System.out.println("after recursive bubble sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void bubble_sortt(int[] a, int n) {
		//base case
		if(n==1) 
			return;
		int didSwap = 0;
		for(int j=0;j<=n-2;j++) {
			if(a[j] > a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				didSwap = 1;
			}
		}
		//if there is no swapping
		if(didSwap == 0)
			return;
		//range for recursion
		bubble_sortt(a,n-1);
	}

}

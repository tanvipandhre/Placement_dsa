package com.placement.dsa.sorting;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		System.out.println("before bubble sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bubble_sortt(arr);
	}
	//we keep the maximum element in the end in each iteration
	//swap the numbers in bubble
	public static void bubble_sortt(int[] a) {
		for(int i = a.length -1; i>=0; i--) {
			int didSwap = 0;
			for(int j = 0; j<=i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					didSwap = 1;
				}
			}
			
			if(didSwap==0) {
				break;
			}
				
			
			
		} 
		System.out.println("after bubble sort");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

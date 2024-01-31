package com.placement.dsa.sorting;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		System.out.println("before insertion sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertion_sortt(arr);
		
	}
	
	public static void insertion_sortt(int[] a) {
		for(int i = 0; i<a.length; i++) {
			int j = i;
			while(j>0 && a[j-1] > a[j]) {
				int temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				j--;
			}
			
		}
		System.out.println("after insertion sort");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}

package com.placement.dsa.sorting;

public class rec_insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		
		System.out.println("before recursive insertion sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertion_sortt(arr, 0 ,arr.length);
		System.out.println("after recursive insertion sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertion_sortt(int[] a, int i, int n) {
		if(i == n)
			return;
		int j=i;
		while(j > 0 && a[j-1] > a[j]) {
			int temp = a[j];
			a[j] = a[j-1];
			a[j-1] = temp;
			j--;
		}
		insertion_sortt(a,i+1,n);
	}

}

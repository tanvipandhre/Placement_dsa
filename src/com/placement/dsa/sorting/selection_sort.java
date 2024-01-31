package com.placement.dsa.sorting;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		System.out.println("before selection sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selection_sortt(arr);
		
	}
	//iteration through entire array in i 
	//minimum element index is selected in one iteration and from jth array 
	//swapping minimum element with ith element
	public static void selection_sortt(int[] a) {
		
		for(int i = 0; i<a.length; i++) {
			int mini = i;
			for(int j = i+1;j < a.length; j++) {
				if(a[mini] > a[j]) {
					mini = j;
				}
			}
			int temp = a[i];
			a[i] = a[mini];
			a[mini] = temp;
			
		}
		System.out.println("after selection sort");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}

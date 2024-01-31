package com.placement.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		
		arr = Arrays.asList( new Integer[] {5,4,3,8,9});
		
		System.out.println("before quick sort");
		for(int i = 0 ; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		quick_sortt(arr, 0 ,arr.size()-1);
		System.out.println("after quick sort");
		for(int i = 0 ; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}

	}
	public static void quick_sortt(List<Integer> arr, int low, int high) {
		if(low<high) {
			int pIndex = partition(arr, low, high);
			System.out.println("partionIndex = "+pIndex);
			quick_sortt(arr, low, pIndex-1);
			quick_sortt(arr, pIndex+1, high);
		}
		
	}
	public static int partition(List<Integer> arr, int low, int high) {
		int pivot = arr.get(low);
		int i = low;
		int j = high;
		while(i < j) {
			while(arr.get(i)<=pivot && i<=high-1) {
				i++;
			}
			while(arr.get(j)>pivot && j>=low+1) {
				j--;
			}
			if(i<j) {
				//swap i and j elements
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
			}
			
				
			
		}
		//swap pivot element with j th element
		int temp = arr.get(low);
		arr.set(low, arr.get(j));
		arr.set(j, temp);
		
		return j;
	}
	public static void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}

}

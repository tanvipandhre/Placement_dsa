package com.placement.dsa.sorting;

import java.util.ArrayList;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,8,9};
		
		System.out.println("before merge sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		merge_sortt(arr, 0, arr.length-1);
		System.out.println("after merge sort");
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void merge_sortt(int[] a, int low, int high) {
		if(low >= high)
			return;
		int mid = (low + high)/2;
		merge_sortt(a, low, mid);
		merge_sortt(a, mid+1, high);
		merge(a, low, mid, high);
		
	}
	public static void merge(int[] a, int low, int mid, int high) {
		ArrayList<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right<=high) {
			if(a[left] <= a[right]) {
				list.add(a[left]);
				left++;
			}else {
				list.add(a[right]);
				right++;
			}
		}
		while(left<=mid) {
			list.add(a[left]);
			left++;
		}
		while(right<=high) {
			list.add(a[right]);
			right++;
		}
		for(int i=low;i<=high;i++) {
			a[i] = list.get(i - low);
		}
	}

}

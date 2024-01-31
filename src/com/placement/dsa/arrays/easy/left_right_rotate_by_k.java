package com.placement.dsa.arrays.easy;

public class left_right_rotate_by_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {5,4,2,1,8};
		int k = 2;
		right_rotate_by_kk(arr, n, k);
		System.out.println("After right rotation of k places");
		for(int i = 0;i <arr.length ; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		left_rotate_by_kk(arr, n, k);
		System.out.println("After left rotation of k places");
		for(int i = 0;i <arr.length ; i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
		

	}
	//Bruteforce Time - O(N) Space - O(k)
	/*
	public static void right_rotate_by_kk(int[] arr, int n, int k) {
		int temp[] = new int[n];
		//store k elements in temp array
		for(int i = n-k; i<n; i++) {
			temp[i-n+k] = arr[i];
		}
		//shift array elements
		for(int i = n-k-1;i>=0; i--) {
			arr[i+k] = arr[i];
		}
		//coppy elements from temp
		for(int i=0;i<k;i++) {
			arr[i] =temp[i];
		}
		
	}
	public static void left_rotate_by_kk(int[] arr, int n, int k) {
		int[] temp = new int[n];
		//shifted k elements in temp
		for(int i = 0; i<k ; i++) {
			temp[i] = arr[i];
		}
		//shift k 
		for(int i=0;i<n-k; i++) {
			arr[i] =arr[i+k];
		}
		for(int i = n-k; i<n; i++) {
			arr[i] = temp[i-n+k];
		}
	}
	*/
	//optimal - reversal algorithm
	public static void Reverse(int[] arr, int start, int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	public static void right_rotate_by_kk(int[] arr, int n, int k) {
		//Reverse last k elements
		Reverse(arr, n-k, n-1);
		//Reverse first n-k elements
		Reverse(arr, 0, n-k-1);
		//Reverse the whole array
		Reverse(arr, 0, n-1);
		
	}
	
	public static void left_rotate_by_kk(int[] arr, int n, int k) {
		Reverse(arr, 0,k-1);
		Reverse(arr, k, n-1);
		Reverse(arr, 0, n-1);
	}

}

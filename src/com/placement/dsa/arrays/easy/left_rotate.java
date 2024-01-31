package com.placement.dsa.arrays.easy;

public class left_rotate {
//left rotate by 1 place
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,8,9,7};
		int[] temp = left_rotate_by_one(arr);
		System.out.println("After rotatting the array by 1");
		for(int i = 0;i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
	}
	//Bruteforce - taking temp array
	//time - O(n) space - O(n)
	/*
	public static int[] left_rotate_by_one(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i = 1;i<arr.length; i++) {
			temp[i-1] = arr[i];
		}
		temp[arr.length-1] = arr[0];
		return temp;
	}*/
	
	//optimal - storing first digit in x
	//time - O(n) space - O(1)
	public static int[] left_rotate_by_one(int[] arr) {
		int x = arr[0];
		for(int i = 1; i<arr.length; i++) {
			arr[i-1] = arr[i];
			
		}
		arr[arr.length-1] = x;
		return arr;
	}

}

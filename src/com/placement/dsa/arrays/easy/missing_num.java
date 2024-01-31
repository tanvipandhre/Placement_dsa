package com.placement.dsa.arrays.easy;

public class missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5};
		int N = 5;
		int x = findMissingNum_brute(arr, N);
		System.out.println("Missing num from brute = "+x);
		int y = findMissingNum_better(arr, N);
		System.out.println("Missing num from better hashing= "+y);
		int z = findMissingNum_opt1(arr, N);
		System.out.println("Missing num from optimal summation= "+z);
		int a = findMissingNum_opt2(arr, N);
		System.out.println("Missing num from optimal xor= "+a);
	}
	//bruteforce -
	//time - O(N^2)
	//space - O(1)
	public static int findMissingNum_brute(int[] arr, int N) {
		
		for(int i = 1; i<=N; i++) {
			int flag = 0;
			for(int j = 0;j<arr.length; j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				return i;
			
		}
		
		return -1;
	}
	//better
	//hashing - will store freq of each element
	//Time O(N)+O(N) = O(2N)
	//space O(N) hash array size
	public static int findMissingNum_better(int[] arr, int N) {
		//we keep size N+1. so that we can include index N
		int[] hash = new int[N+1];
		//hash array will store freq of arr
		for(int i = 0; i<N-1; i++) {
			hash[arr[i]]++;
		}
		for(int i =1;i<=N; i++) {
			if(hash[i]== 0) {
				return i;
			}
		}
		return -1;
	}
	
	//optimal - summation
	public static int findMissingNum_opt1(int[] arr, int N) {
		int missingNum=-1;
		int sum = (N*(N+1))/2;
		int s = 0;
		for(int i=0;i<arr.length;i++) {
			s += arr[i];
		}
		missingNum = sum - s;
		return missingNum;
	}
	
	
	//optimal xor
	// a^a = 0, 0^a = a
	public static int findMissingNum_opt2(int[] arr, int N) {
		int xor1= 0, xor2 = 0;
		for(int i = 0;i<N-1; i++) {
			xor2 = xor2 ^ arr[i]; //array element
			xor1 = xor1 ^ (i+1); //xor from 1 to N-1
		}
		xor1 = xor1 ^ N;
		return (xor1^xor2);
	}
	
}

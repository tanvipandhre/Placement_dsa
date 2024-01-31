package com.placement.dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class num_occur_once {
	//find num that occurs only once and the rest others occcur twice
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,4,1,1};
		int x = num_occurred_once_brute(arr);
		System.out.println("Num that occured only once using bruteforce "+x);
		int y = num_occurred_once_better_hash(arr);
		System.out.println("Num that occured only once using hashing "+y);
		int z = num_occurred_once_better_hashmap(arr);
		System.out.println("Num that occured only once using hash map "+z);
		int a = num_occurred_once_optimal_xor(arr);
		System.out.println("Num that occured only once using xor "+a);
		
	}
	//bruteforce
	//time - O(N^2)
	//space - O(1)
	public static int num_occurred_once_brute(int[] arr) {
		for(int i = 0;i<arr.length; i++) {
			int y = arr[i];
			int count=0;
			for(int j=0; j<arr.length;j++) {
				if(y==arr[j]) {
					count++;
				}
			}
			if(count==1)
				return y;
		}
		return -1;
	}
	//hashing - better
	//time - O(3N)
	//space - O(maxi +1)
	public static int num_occurred_once_better_hash(int[] arr) {
		int maxi = arr[0];
		for(int i=0;i<arr.length; i++) {
			maxi = Math.max(arr[i], maxi);
		}
		
		int[] hash = new int[maxi+1];
		for(int i = 0;i<arr.length; i++) {
			hash[arr[i]]++;
		}
		for(int i = 0;i<arr.length; i++) {
			if(hash[arr[i]] == 1) {
				return arr[i];
			}
		}
				
		return -1;
	}
	//hashmap
	//time O(N*logM) + O(M) where N - size of arr , M is size of hashmap
	//space O(M)
	public static int num_occurred_once_better_hashmap(int[] arr) {
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for(int i = 0;i<arr.length; i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> it: freq.entrySet()) {
			if(it.getValue() == 1) {
				return it.getKey();
			}
		}
		return -1;
	}
	//xor a^a = 0, 0^a = a
	//optimal
	//time O(N)
	//space O(1)
	public static int num_occurred_once_optimal_xor(int[] arr) {
		int x = 0;
		for(int i =0;i<arr.length;i++) {
			x = x^arr[i];
		}
		return x;
	}
	
}

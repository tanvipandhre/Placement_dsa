package com.placement.dsa.recursion.basic;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sumofdigitsRecursion_opt(456);
		System.out.println(sum);
	}
	//time - o(d) space - O(d)
	public static int sumofdigitsRecursion(int n) {
		if(n==0) return 0;
		return sumofdigitsRecursion(n/10) + n%10;
	}
	//one recursive call is reduced.
	public static int sumofdigitsRecursion_opt(int n) {
		if(n<=9) return n;
		return sumofdigitsRecursion_opt(n/10) + n%10;
	}

}

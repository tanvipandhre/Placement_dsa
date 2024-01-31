package com.placement.dsa.maths;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = isArmstrong(153);
		System.out.println(bool);
	}
	public static boolean isArmstrong(int n){
		int num = n;
		int sum = 0;
		while(num != 0){
			int digit = num%10;
			sum = sum + (int)Math.pow(digit, 3);
			System.out.println(sum);
			num = num/10;

		}
		System.out.println(sum);
		if(sum == n) return true;
		else return false;

	}
}

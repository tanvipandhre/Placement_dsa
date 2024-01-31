package com.placement.dsa.maths;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//time limit exceeded
	 public int reverse(int x) {
        int num = x;
        int rev = 0;
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;

        }
        return rev;
    }

}

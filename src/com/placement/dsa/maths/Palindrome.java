package com.placement.dsa.maths;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean palindromeNumber(int n){
        // Write your code here.
        boolean isPalindrome = false;
        int rev = 0;
        int num = n;
        while(num != 0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        
        if(rev == n)
            isPalindrome = true;
        
        return isPalindrome;


    }

}

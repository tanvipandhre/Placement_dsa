package com.placement.dsa.maths;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//time - O(n) space - O(1)
	public static int countDigits_brute(int n){
        // Write your code here.
        int num = n;
        int count = 0;
        while(num!=0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }
	
	//time - O(1) space- O(1)
	public static int countDigits_string(int n){
        // Write your code here.
        String s = Integer.toString(n);
        int l = s.length();
        return l;
    }
	//Math.floor returns double value
	//time - O(1) space- O(1) 
	 public static int countDigits_log(int n){
	        // Write your code here.
	        int digits = (int)Math.floor(Math.log10(n)+1);
	        return digits;
	    }
	
	

}

package com.placement.dsa.bitwise;

public class setBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = countSetBits(4);
		System.out.println(c);
	}
	static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        int x= 1;
        for(int i = 0;i<k-1; i++) x=x*2;
        if((n&x)!=0) return true;
        else return false;

    }
	
	public static String oddEven(int N){
        // Write your code here.
        if((N&1)!=0) return "odd";
        else return "even";

    }
	public static boolean isPowerOfTwo(int n) {
        // Write your code here.
        return (n&(n-1))==0;
    }
	//time - O(d) number of binary digits TLE  
	public static int countSetBits(int n) {
        //Write your code here
		int num = n;
        if(num==1) return 1;
        int count = 0;
        
        while(num!=0){
            if((num & 1)!=0) count++;                      
            num=num/2;

        }
        System.out.println(count);
        return count + countSetBits(n-1);
    }
	//Brian Kerningham algo
	public static int countSetBits_brian(int n) {
        //Write your code here       
        
        int count = 0;
        for(int i=1;i<=n;i++){
            int num = i;
            while(num > 0){
                num = num & (num-1);
                count++;

            }
        }
        
        
        return count ;
    }	
	//set the rightmost bit
	public static int setBits_toright(int N){
        // Write your code here.
        if((N & (N+1)) == 0) return N;
        else return (N | (N+1));
        
    }
	// swap numbers
	public static void swapNumber(int []a, int []b) {
        // Write your code here.
        int a0 = a[0];
        int b0 = b[0];
        a[0] = (a0^b0)^a0;
        b[0] = (a0^b0)^b0;
    }
	//calculate flipbits
	public static int flipBits(int A, int B){
        // Write your code here.
        int x = A^B;
        int count = 0;
        while(x>0){
            x = x & (x-1);
            count++;
        }
        return count;
    }
	
	

}

package com.placement.dsa.maths;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = power_optimized(2,3);
		System.out.println(res);
	}
	//naive gives 0 for power(14,41);
	public static int power_brute(int N, int R){
        // Write your code here.
        int ans= 1;
           
            
            for(int i = 0;i<R; i++)
                ans = ans*N;
                
            
        
        return ans;
    }
	public static int power_optimized(int N, int R){
        // Write your code here.
        if(R==0) return 1;
        int temp = power_optimized(N,R/2);
        temp = temp*temp;         
        if(R%2==0)//even power
            return temp;
        else //odd        
            return  temp * N;
            
                
            
        
        
    }
}

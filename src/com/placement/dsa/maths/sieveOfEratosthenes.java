package com.placement.dsa.maths;

import java.util.*;

public class sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List< Integer > countPrimes(int n) {
        // Write your code here.
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        List<Integer> primeList = new ArrayList<Integer>();
        
        for(int i = 2;i*i<n;i++){
            if(isPrimeNum(i)){
                //this is how we take multiples
                for(int j=2*i;j<=n;j=j+i){ 
                    isPrime[j]=false;
                }
            }
        }
        for(int i = 2;i<n; i++){
            if(isPrime[i] && n%i==0) primeList.add(i);
        }
        
        return primeList;
    }
    public static boolean isPrimeNum(int n){
        if(n==1) return false;
        for(int i = 2; i*i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
